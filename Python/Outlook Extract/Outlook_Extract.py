import win32com.client
import openpyxl

# Inicializa o Outlook
outlook = win32com.client.Dispatch("Outlook.Application").GetNamespace("MAPI")

# Obtém a pasta HOTLINE SENASP/Chamados na caixa de entrada principal do Outlook
inbox = outlook.GetDefaultFolder(6)  # 6 representa a pasta de entrada

# Inicializa uma nova planilha do Excel
workbook = openpyxl.Workbook()
sheet = workbook.active

# Itera sobre todos os e-mails na pasta
for email in inbox.Items:
    # Verifica se o e-mail contém os campos necessários
    if "Incident ID:" in email.Body and "Incident Priority:" in email.Body and "Created By:" in email.Body and \
            "Created Date/Time:" in email.Body and "Site:" in email.Body and "Summary:" in email.Body:
        # Extrai os dados do corpo do e-mail
        incident_id = email.Body.split("Incident ID:")[1].split(":")[1].strip()
        priority = email.Body.split("Incident Priority:")[1].split(":")[1].strip()
        created_by = email.Body.split("Created By:")[1].split(":")[1].strip()
        created_datetime = email.Body.split("Created Date/Time:")[1].split(":")[1].strip()
        site = email.Body.split("Site:")[1].split(":")[1].strip()
        summary = email.Body.split("Summary:")[1].split(":")[1].strip()

        # Adiciona os dados à planilha do Excel
        sheet.append([incident_id, priority, created_by, created_datetime, site, summary])

# Salva a planilha do Excel
workbook.save("output.xlsx")

print("Dados extraídos e salvos na planilha Excel.")
