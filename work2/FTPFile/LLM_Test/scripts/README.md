# Scripts

- `generate_tests_*.py`:
Genera casi di test usando un LLM (Codex, GPT). Produce un JSON contenente tutte le classi java generate. 
Il numero di token da usare e lo scenario sono specificati come parametro nel momento dell'esecuzione dello script.
- `fix_tests_openai.py`: Applica alcune euristiche fissate per limitare gli errori più comuni in fase di compilazione (funziona con GPT e Codex).

# Configuration
- `example_config.json`: File usato per impostare la configurazione degli script `test_file_generation.py`: 
	- `API_KEY`: La secret key generata da OpenAI che ci permette di effettuare le richieste api verso OpenAI.
	- `BASE_DIRECTORY`: Percorso della directory base del progetto sotto analisi.

# Modello usato: GPT4-o