# JavaContextRetriever

## Descrizione
Il progetto **JavaContextRetriever** è stato progettato per generare automaticamente un *prompt* utilizzando le configurazioni definite nel file `config.properties`. La generazione del prompt avviene tramite la classe Java `JavaOpenAIPromptGenerator.java`, situata in `src/main/java/s2e/generators`. Questo file descrive il funzionamento del sistema e fornisce istruzioni per configurare e utilizzare il progetto.

---

## Configurazione del file `config.properties`
Il file `config.properties` è essenziale per personalizzare il comportamento di **JavaContextRetriever**. Si trova nella directory principale del progetto ed è un file di configurazione in formato chiave-valore.


### Come modificare il file `config.properties`
1. Apri il file `config.properties` con un editor di testo.
2. Imposta i valori delle chiavi in base alla struttura del tuo progetto.
3. Salva le modifiche prima di avviare il programma.

---

## Funzionamento di `JavaOpenAIPromptGenerator.java`
La classe `JavaOpenAIPromptGenerator` è il cuore del sistema. Una volta eseguita, la sua funzione principale è leggere le configurazioni dal file `config.properties`, analizzare la directory specificata, e generare un prompt strutturato per l'input del modello OpenAI.


