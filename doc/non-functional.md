# Nem-funkcionális jellemzők vizsgálata - Nagy Kevin

## Telepítés

A projectnek van egy "readme" fájlja, amiben szépen le vannak írva a build-hez valamint a teszt futtatásához szükséges tudnivalók.
Az egyetlen amit hiányoltam, az a "gradle-wrapper.properties"-ben meglévő (eredetileg rosszul, meg régi, de ezt javítottam) 
"distributionUrl", tehát a Gradlehez valami link, mert nem szabad azt feltételezni, hogy mindnekinek megvan a gépén.

Ettől függetlenül, alapvetően nem komplex a Gradle használata, egy google kereséssel és egy parancs kimásolásával már le is küzdötte az illető az összes nehézséget.

## Könyvtár

Ugyan így a "readme" a library használatához is segítséget nyújt. Itt is volt egy hibás link, az rdf4j-hez tartozót javítanom kellett.
Itt az a helyzet, hogy egyválzotós oszályok esetében tök egyszerű az egész, egy adatosztály kell és kész (meg ugye a readme-s parancsba a megfelelő nevet helyettesíteni).

## Tesztek

A readme itt is kisegíti a rászorulókat, és még nagyon hasznos példateszteket is kapunk mellé, ami véleményem szerint sokkal könnyebbé teszi a megértést, mint a szavakkal való körülírás és magyarázás.
Ha egy SQL dokumentációt nézek például, ott is mindig csak legörgetek a példakódhoz, és abból rögtön látszik a működés, általában nem is szükséges nekem hozzá a magyarázat.

A tesztekben annyi nehézség akad viszont, hogy szükségünk van adatosztályokra. Alapesetben getterek, setterek meg konstruktorok elkészítésére van csak szükség, de ami komplexé teszi a dolgot, az az, hogy náhány esetben felül kell írnunk bizonyos függvényeket.
Ezzekhez már jól jönne a példákon kívül magyarázat, komment vagy valami, ezek nélkül nagyon nehéz volt megértenem őket. Mikor miért kell felülírni valami függvényt, vagy miért kell az adott kódsor.

A java fileok szerencsére jól kommentezettek, ott nem volt gond, elérte a 36%ot, ami elég jó


Csináltam egy gradle scant is, amit itt elérhető: https://scans.gradle.com/s/swzkd7ccylwji#switches
