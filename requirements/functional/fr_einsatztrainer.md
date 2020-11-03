# Functional requirements

## Einsatztrainer

- #### Das System muss dem Einsatztrainer die Möglichkeit geben, ein neues Training zu erstellen.

- #### Das System muss dem User eine Übersicht geben, welche Teilnehmer zu den jeweiligen Trainings angemeldet sind.

- #### Das System muss zu jedem Training eine Teilnehmerliste generieren und ausdrucken können.

- #### Das System muss erfassen können, wer wann welches Training absolviert hat.

- #### Das System muss für jeden Teilnehmer eine Teilnahmebestätigung generieren und ausdrucken können.

| Funktion                        | Eingaben                                                                         | Umsetzung | Ausgabe                                           | Zeit? |
| ------------------------------- | -------------------------------------------------------------------------------- | --------- | ------------------------------------------------- | ----- |
| Training erstellen              | (TrainingsID)?, Titel, Beschreibung, Datum, Uhrzeit, Ort, maxTN, Voraussetzungen |           | Training erfolgreich erstellt / Fehler            |       |
| TN-Übersicht ausgeben           | (TrainingsID)                                                                    |           | Teilnehmerübersicht im Programm zum jew. Training |       |
| Teilnehmerliste generieren      | (TrainingsID), Button "Liste generieren"                                         |           | Teilnehmerliste als PDF (zum Ausdrucken)          |       |
| Teilnahme bestätigen pro TN     | (TrainingsID), (TeilnehmerID), Button?, Checkbox?                                |           | "Teilnahme für TN X wurde bestätigt." / Fehler    |       |
| Teilnahmebestätigung generieren | (TrainingsID), (TeilnehmerID), Button "Bestätigung generieren"                   |           | Teilnehmerbestätigung als PDF (zum Ausdrucken)    |       |
|                                 |                                                                                  |           |                                                   |       |
