## Struttura delle cartelle

- `JavaContextRetriever`: Strumento che ci serve per generare il prompt o i vari prompt che poi ci serviranno durante la comunicazione con le api del LLM, si può adattare a tutte le classi.
- `NomeDellaClasse`: Cartella in cui si trova tutto quello che riguarda la classe e i suoi test, quindi: codice sorgente, test con evosuite e randoop, test degli studenti, test con gli LLM. E per ciascuno oltre al codice dei test ci sono anche i relativi risultati in termini di copertura.

## Istruzioni per la generazione

### 1. `Generazione del prompt`
La prima cosa da fare è generare il prompt con il JavaContextRetriver, quindi configurare lo strumento per la classe per cui si desidera generare il prompt, e eseguire il JavaOpenAIPromptGenerator.

### 2. `Esecuzione dello script per la generazione`
Recarsi in nomeDellaClasse/LLM_Test/scripts ed eseguire lo script generate_tests.py, inserendo i parametri per indicare numero di token da utilizzare nella generazione, percorso della cartella in cui andare a salvare i file che il modello ci darà in risposta e percorso in cui si trova il prompt che daremo come input al modello stesso.

### 3. `Inserimento dei test nell'ambiente di esecuzione`
Inserire i test appena generati in nomeDellaClasse/ProgettoNomeDellaClasse/src/test, in questo modo con il comando mvn clean test, mandiamo in esecuzione i test, se ci sono errori di compilazione devono essere risolti e una volta che i test vengono generati usare il comando mvn jacoco:report per la generazione dei report sulla copertura che si troveranno nella cartella target/site.