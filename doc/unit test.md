# Unit tesztek és tesztek kódlefedettségének mérése

## Összefoglalás

JaCoCo segítségével először megnéztem a projekt lefedettségét és ez alapján kiválasztottam, hogy melyik területet próbálom javítani
ezen a téren. Ezután JUnit5 segítségével megvalósítottam az előbb meghatározott egységteszteket.

## Lefedettség mérése

A projekthez már tartozott egy teszt osztály ami leginkább az RDFMapper osztályt és annak működéséhez szorosan kapcsolódó részeket 
ellenőrizte. Ezeken a területeken viszonylag magas lefedettség a jellemző, és így annak javítása meglehetősen körülményes lett volna. 
Ezért úgy döntöttem, hogy egy teljesen lefedetlen osztály tesztelését fogom megvalósítani.

## Tesztek megvalósítása

A Beans osztály egy segédosztály, melynek a feladata, hogy meghatározza a kapott osztályról vagy objektumról, hogy primitív-e és 
visszaadja annak mezőit és metódusait. A tesztelést először mockito segítségével végeztem volna, de erre nem volt szükség az osztály 
jellege miatt. A tesztek implemetálása után sikerült az osztály lefedettségét 100%-hoz közelire emelni.
![lefedettseg](https://github.com/BME-MIT-IET/pinto-pussy-project-iet-2020/blob/master/lefedettseg.png)
