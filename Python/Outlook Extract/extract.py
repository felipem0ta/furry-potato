import re
from openpyxl import Workbook

# Função para encontrar e extrair informações dos campos do arquivo
def extrair_informacoes(texto):
    incident_id = re.search(r'IncidentID:(\d+)', texto)
    created_by = re.search(r'CreatedBy:(.+)', texto)
    created_date_time = re.search(r'CreatedDate/Time:(.+)', texto)
    site = re.search(r'Site:(.+)', texto)
    summary = re.search(r'Summary:(.+)', texto)

    if incident_id and created_by and created_date_time and site and summary:
        return incident_id.group(1), created_by.group(1).strip(), created_date_time.group(1).strip(), site.group(1).strip(), summary.group(1).strip()
    else:
        return None

# Abrir o arquivo de entrada
with open('chamados.txt', 'r') as file:
    chamados = file.read()

# Criar uma nova planilha do Excel
wb = Workbook()
ws = wb.active
ws.append(['IncidentID', 'CreatedBy', 'CreatedDate/Time', 'Site', 'Summary'])

# Encontrar e extrair informações dos campos e adicionar à planilha
matches = re.finditer(r'IncidentID:(.+?)(?=(IncidentID:|$))', chamados, re.DOTALL)
for match in matches:
    info = extrair_informacoes(match.group())
    if info:
        ws.append(info)

# Salvar a planilha do Excel
wb.save('chamados.xlsx')

print('As informações foram extraídas e salvas no arquivo chamados.xlsx')
