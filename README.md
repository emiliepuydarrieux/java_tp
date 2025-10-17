# java_tp

Petit projet Java contenant une mini-calculette console.

Fichiers importants
- `MainApp.java` : application principale (package `java_tp`) — calculette interactive.
- `main.java` : fichier conservé (commentaire) — la classe exécutable est `MainApp`.

Compilation et exécution (Windows PowerShell)

1. Ouvrez PowerShell et placez-vous dans le dossier du projet :

```powershell
cd c:\Users\cleog\Downloads\jkhklh\java_tp
```

2. Compiler :

```powershell
javac MainApp.java
```

3. Exécuter (mode interactif) :

```powershell
java java_tp.MainApp
```

4. Exécuter le mode démo (affiche quelques calculs et erreurs attendues) :

```powershell
java java_tp.MainApp demo
```

Utilisation
- Au lancement interactif, le programme vous demande : premier nombre, opérateur (+ - * /), second nombre.
- Tapez `q` à n'importe quel prompt pour quitter.
- La division par zéro est interceptée et affichera un message d'erreur.

Notes
- Le code utilise le package `java_tp`, c'est pourquoi on exécute la classe via `java java_tp.MainApp`.
- Si vous préférez, vous pouvez compiler tous les fichiers du dossier avec `javac *.java`.

Si vous voulez que j'exécute la compilation et le test demo ici, dites-le et je lancerai les commandes.

