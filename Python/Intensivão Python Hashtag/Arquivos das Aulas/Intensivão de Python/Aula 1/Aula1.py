#IMPORTS
import pyperclip
import pyautogui
import pandas as pd
import time

#Pausa de 1 segundo antes da primeira execução e após casa execução
pyautogui.PAUSE = 1
time.sleep(1)
"""
A seção abaixo abre uma nova aba do navegador,
digita o link na barra de endereço e
aperta enter

"""
pyautogui.hotkey("ctrl", "t")
pyperclip.copy("https://drive.google.com/drive/folders/149xknr9JvrlEnhNWO49zPcw0PW5icxga?usp=sharing")
pyautogui.hotkey("ctrl", "v")
pyautogui.press("enter")

time.sleep(5)

#Entrar na pasta "Exportar", clica com botão direito no arquivo e clica em Download
pyautogui.doubleClick(x=-631, y=270)
time.sleep(5)
pyautogui.rightClick(x=-618, y=352)
pyautogui.click(x=-513, y=652)
time.sleep(5)
pyautogui.press("enter")

#Importar a tabela de vendas com o pandas e calcular os indicadores
time.sleep(3)
tabela = pd.read_excel(r"C:\Users\felipe.mota\Downloads\Vendas - Dez.xlsx")
faturamento = tabela["Valor Final"].sum()
quantidade = tabela["Quantidade"].sum()

#Gerar o relatório e mandar por e-mail (Vou usar o Google Docs, mas dá pra entender o cenário geral)
pyautogui.hotkey("ctrl", "t")
pyperclip.copy("https://docs.google.com/document/u/0/")
pyautogui.hotkey("ctrl", "v")
pyautogui.press("enter")

time.sleep(5)

pyautogui.click(x=-75, y=622)
pyautogui.write("Para: felipe.mota@iafisgroup.com\n")
pyperclip.copy("Relatório de vendas:")
pyautogui.hotkey("ctrl", "v")

texto = f"""
Prezados, bom dia!

O faturamento de ontem foi R${faturamento:,.2f}
A quantidade de produtos vendidos foi: {quantidade:,.2f}

Att. Felipe
"""

pyperclip.copy(texto)
pyautogui.hotkey("ctrl","v")