# ARZT

- #### Als Polizeiarzt möchte ich Untersuchungstermine erstellen können, damit sich Teilnehmer dafür anmelden können.

- #### Als Polizeiarzt möchte ich wissen, wer zu meinen Untersuchungsterminen angemeldet ist, damit ich besser planen kann.

- #### Als Polizeiarzt möchte ich eine Teilnehmerliste ausdrucken können, damit ich nachvollziehen kann, ob alle angemeldeten Teilnehmer auch untersucht worden sind.

- #### Als Polizeiarzt möchte ich im System eintragen können, wer eine Untersuchung erfolgreich absolviert hat, damit die Tauglichkeit für den Polizeidienst erhalten bleibt.

- #### Als Polizeiarzt möchte ich im System eintragen können, wer eine Untersuchung nicht erfolgreich absolviert hat, damit aufscheint, wer eine Nachuntersuchung machen muss (Ziel: Verbesserung des Fitness-/Gesundheitszustandes)

- #### Als Polizeiarzt möchte ich ein Attest ausstellen können, damit einem Teilnehmer die Tauglichkeit für den Polizeidienst bestätigt werden kann.

| Funktion                    | Eingaben                                                        | Umsetzung | Ausgabe                                                          | Zeit? |
| --------------------------- | --------------------------------------------------------------- | --------- | ---------------------------------------------------------------- | ----- |
| Untersuchung erstellen      | (UntersuchungsID)?, Titel, Datum, Uhrzeit, Ort, maxTN           |           | Untersuchung erfolgreich angelegt/ Fehler                        |       |
| TN-Übersicht ausgeben       | (UntersuchungsID)                                               |           | Teilnehmerübersicht im Programm zur. jew. Untersuchung           |       |
| Teilnehmerliste generieren  | (UntersuchungsID), Button "Liste generieren"                    |           | Teilnehmerliste als PDF (zum Ausdrucken)                         |       |
| Teilnahme bestätigen pro TN | (UntersuchungsID), (TeilnehmerID), Ergebnis, Button?, Checkbox? |           | "Tauglichkeit für TN X wird bestätigt/nicht bestätigt." / Fehler |       |
| Attest generieren           | (UntersuchungsID), (TeilnehmerID), Button "Attest generieren"   |           | Attest als PDF (zum Ausdrucken)                                  |       |
