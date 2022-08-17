import csv

f = open(r'D:\Workspace\furry-potato\Python\Cousera_Google Automation\Python x Operating System\Week 2\AppleStore.csv')
csv_f = csv.reader(f)

#Iterar sobre o conteudo do arquivo
for row in csv_f:
    id_track, track_name, size_bytes, currency, price, rating_count_tot, rating_count_ver, user_rating,	user_rating_ver, ver, cont_rating, prime_genre, sup_devices_num, ipadSc_urls_num, lang_num, vpp_lic = row
    print("id_track: {} ", 'track_name: {} ', 'size_bytes: {} ', 'currency: {} ', 'price: {} ', "rating_count_tot: {} ", 'rating_count_ver: {} ', 'user_rating: {} ',	'user_rating_ver: {} ', 'ver: {} ', 'cont_rating: {} ', 'prime_genre: {} ', 'sup_devices_num: {} ', 'ipadSc_urls_num: {} ', 'lang_num: {} ', "vpp_lic: {}")


