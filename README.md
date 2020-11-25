# bn

1.                  W oparciu o Page Object Model (POM), Selenium i wybrany framework testowy (TestNG lub JUnit) przygotuj testy end to end:

•                    Ścieżki ze strony głównej bn (bn.org.pl) przez menu główne – dla bibliotekarzy – aktualności

•                    Przez menu główne na stronie bn do polona.pl

Nie ma konieczności mapowania wszystkich elementów stron, wystarczą te używane w testach.

2.                  W oparciu o POM proszę stworzyć w projekcie klasy pozwalające na obiektowe budowanie plików JSON o budowie:

{

"title": "string",

"startDate": "yyyy-mm-dd",

"endDate": "yyyy-mm-dd",

"description": "string",

"affiliation": {

  "id": "string",

  "name": "string"

},

"keywords": [

  "string"

],

"invites": [

  "string"

],

"inviteMessage": "string",

"projectid": "string"

}

 

Proszę o napisanie testu, który serializuje JSONa do pliku lub wypisuje go do konsoli w postaci Stringa. Do serializacji możesz użyć bibliotek Jacksona lub Gsona. Testowy JSON powinien zawierać wszystkie wartości podane w przykładowym JSONie, ponadto przynajmniej dwa słowa kluczowe (keywords) i dwa zaproszenia (invites).

3.                  Korzystając z biblioteki RestAssured, proszę stworzyć klasy i testy odpowiadające za wysłanie JSONa z poprzedniego zadania z żądaniem POST na dowolny adres (nie musi być prawdziwy). Do serializacji można użyć np. funkcji Mapper z Jacksona.

