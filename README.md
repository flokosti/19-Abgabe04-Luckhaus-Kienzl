# Lab Report Vertiefende Gesamtwiederholung

Abgabe 04

Pascal Luckhaus

Eva-Maria Kienzl

Repository: [https://github.com/PascalLuckhaus/19-Abgabe04-Luckhaus-Kienzl.git](https://github.com/PascalLuckhaus/19-Abgabe04-Luckhaus-Kienzl.git)

Im Rahmen dieser Übung werden alle Lehrveranstaltungsinhalte von Konfigurationsmanagement gesammelt wiederholt. Dieses Dokument dient als Protokoll.

## Taskliste

- [X] Übertragen der Taskliste in Markdown Readme
- [X] Einspielen der Queue Vorlage
- [X] Korrigieren / Verbessern
- [X] Klassen- und Methodenkommentare mittels Javadoc
- [ ] JUnit Tests erstellen
- [ ] Programmtestung
- [ ] Anpassen der pom.xml
- [ ] Log4j integrieren
- [ ] Maven Site Dokumentation
- [ ] Erstellung und nachvollziehbarer Markdown Lab Report
- [ ] Vollständigkeit der Abgabe überprüfen
- [ ] Abgabe PDF Version

## Vorgehen
Bei der Erstellung des readme durch Eva wurde die Taskliste in einem ersten Schritt mit allen Hauptpunkten der Aufgaben erstellt. Nach anfänglichen kleinen Syntax-Problemen im Markdown war der erste Arbeitsauftrag erledigt.

**Anmerkung:** Sollten einzelne Punkte einer genaueren Aufschlüsselung bedürfen, weil die Arbeitsaufträge viel Zeit in Anspruch nehmen oder aufgeteilt werden sollen, sind diese in einem weiteren Schritt zu ergänzen.

Pascal hat währenddessen die Queue Vorlage ins Repository eingespielt (mit einem kleinem Merge Konflikt). Die pom.xml ist in der mitgelieferten Form enthalten und gitignore wurde erstellt.

Gemeinsame Fehlersuche auf Pascals Laptop:
- Übergabeparameter bei Constructor richtig stellen
- poll()-Methode: Korrektur in if zu != anstelle von ==
- remove()-Methode: Entfernen der ständigen Überschreibung der Variable Element als leeres Element, nachdem die poll-Methode aufgerufen wurde.

**Anmerkung:** Wir müssen beim JUnit-Test herausfinden, ob die maxSize wirklich verwendet wird (aktuell als redundant angezeigt).

Pascal hat die Methoden dann zusätzlich etwas übersichtlicher gestaltet: Klammern, return-Werte, etc.

Die Klassen- und Methodenkommentare wurden von Eva verfasst und eine API Dokumentation in folgender Form über IntelliJ-Tools erzeugt:

![JavaDoc](media/javadoc.png)

Die Verfassung des Lap Reports / readme ist OHNE Markdown Editor passiert. Deshalb kam es hin und wieder zu nötigen Richtigstellungen der Befehle. Für die Zukunft wäre ein entsprechender Editor, in dem die Formatierungsbefehle ausgeführt werden zu empfehlen.

## Links / Literatur
Unterlagen aus den Vorlesungen und vorangegangenen Übungen. Weiterführende Links der Aufgabenstellung.
