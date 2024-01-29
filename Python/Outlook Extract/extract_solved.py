import re
from openpyxl import Workbook

# Função para encontrar e extrair informações dos campos do arquivo
def extrair_informacoes(texto):
    incident_id = re.search(r'IncidentID:(\d+)', texto)
    created_by = re.search(r'ResolvedBy:(.+)', texto)
    created_date_time = re.search(r'ResolvedOn:(.+)', texto)
    site = re.search(r'Site:(.+)', texto)
    Resolution = re.search(r'Resolution:(.+)', texto)

    if incident_id and created_by and created_date_time and site and Resolution:
        return incident_id.group(1), created_by.group(1).strip(), created_date_time.group(1).strip(), site.group(1).strip(), Resolution.group(1).strip()
    else:
        return None

# Abrir o arquivo de entrada
with open('chamados_resolvidos.txt', 'r') as file:
    chamados = file.read()

# Criar uma nova planilha do Excel
wb = Workbook()
ws = wb.active
ws.append(['IncidentID', 'ResolvedBy', 'ResolvedOn', 'Site', 'Resolution'])

# Encontrar e extrair informações dos campos e adicionar à planilha
matches = re.finditer(r'IncidentID:(.+?)(?=(IncidentID:|$))', chamados, re.DOTALL)
for match in matches:
    info = extrair_informacoes(match.group())
    if info:
        ws.append(info)

# Salvar a planilha do Excel
wb.save('chamados_resolvidos.xlsx')

print('As informações foram extraídas e salvas no arquivo chamados_resolvidos.xlsx')
