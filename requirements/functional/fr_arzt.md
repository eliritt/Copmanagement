# Functional requirements

## Arzt

- #### Das System muss dem Arzt die Möglichkeit geben, eine neue Untersuchung zu erstellen.

- #### Das System muss dem User eine Übersicht geben, welche Teilnehmer zu den jeweiligen Untersuchungen angemeldet sind.

- #### Das System muss zu jeder Untersuchung eine Teilnehmerliste generieren und ausdrucken können.

- #### Das System muss erfassen können, wer wann seine Untersuchung erfolgreich absolviert hat und bei wem dies nicht der Fall war.

- #### Das System muss für jeden Teilnehmer ein ärztliches Attest generieren und ausdrucken können.

| Funktion                    | Eingaben                                                        | Umsetzung | Ausgabe                                                          | Zeit? |
| --------------------------- | --------------------------------------------------------------- | --------- | ---------------------------------------------------------------- | ----- |
| Untersuchung erstellen      | (UntersuchungsID)?, Titel, Datum, Uhrzeit, Ort, maxTN           |           | Untersuchung erfolgreich angelegt/ Fehler                        |       |
| TN-Übersicht ausgeben       | (UntersuchungsID)                                               |           | Teilnehmerübersicht im Programm zur. jew. Untersuchung           |       |
| Teilnehmerliste generieren  | (UntersuchungsID), Button "Liste generieren"                    |           | Teilnehmerliste als PDF (zum Ausdrucken)                         |       |
| Teilnahme bestätigen pro TN | (UntersuchungsID), (TeilnehmerID), Ergebnis, Button?, Checkbox? |           | "Tauglichkeit für TN X wird bestätigt/nicht bestätigt." / Fehler |       |
| Attest generieren           | (UntersuchungsID), (TeilnehmerID), Button "Attest generieren"   |           | Attest als PDF (zum Ausdrucken)                                  |       |
