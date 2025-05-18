

# Definition/Funktion

- ein Halbaddierer addiert ist eine logische Schaltung, die ==2 einzelne Binärzahlen addieren== kann
- Eingänge:
	- A (1. Bit)
	- B (2. Bit)
- Ausgänge:
	- Summe (S)
	- Übertrag (Ü)

# Wahrheitstabelle

| a   | b   | S   | Ü   |
| --- | --- | --- | --- |
| 0   | 0   | o   | 0   |
| 0   | 1   | 1   | 0   |
| 1   | 0   | 1   | 0   |
| 1   | 1   | 0   | 1   |

Schaltterme:

- S = A ⊕ B (XOR-Gatter)
- Ü = A **∧** B (UND-Gatter)

![[Pasted image 20250518200951.png]]

# Unterschied zum [[Volladdierer]]

| Halbaddierer (Blau)                               | Volladdierer (Schwarz)                                                                              |
| ------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| Nur einfache Additionen ohne Übertrag möglich     | Kann mehrstellige Binärzahlen Addieren                                                              |
| Beschreibt die erste Stelle einer Addierschaltung | Beschreibt die anderen Stellen einer Addierschaltung, da der vorherige Übertrag berücksichtigt wird |
|                                                   |                                                                                                     |
![[Pasted image 20250518201536.png]]
