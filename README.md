# TP6 : Exceptions & Fichiers

### Objectifs
Utiliser les Exceptions, créer, ouvrir, lire et écrire dans des fichiers

### Prérequis
- Cloner le projet sur votre poste dans le repertoire de votre choix
- Ouvrir le projet :
	- Sur l'écran d'accueil d'IntelliJ, cliquer sur **Open**
	- Sélectionner le dossier **ECUE2-TP6** qui a été copié depuis github puis cliqué sur **OK**.
	- Le projet s'ouvre
	- Allez vérifier que le SDK est bien sélectionné dans **File > Project Structure** onglet **Project**

### Utilisation de GIT

- Créer une nouvelle branche **prenomNom**
- Faire **1 commit** par exercice (sauf exercice 0)
- Ouvrir une *pull request* sur github :
  - Aller sur votre projet sur GitHub
  - Cliquer sur **New Pull Request**,
  - Sélectionner base repository = **harf18/ECUE2-TP6**
  - Sélectionner compare = votre branche **prenomNom**


> Si vous ne l'avez pas encore fait, pensez a créer une nouvelle branche **prenomNom**

### Exercice 1

- Créer une classe **Division**
- Ecrire une méthode ``` public double division1(int a, int b)``` qui retourne la division de a par b **sans gérer d'exception**. *Écrivez simplement a / b, sans transtyper a ou b en double (sinon vous obtiendrez Infinity au lieu d'une exception).*
- Dans **Execute** compléter la méthode **exercice1()** pour appeler division1(int a, int b) avec a=10 et b=0, et afficher le résultat
- Executer la méthode main() (qui execute la méthode exercice1())

> Pensez a faire votre 1er commit !!  

### Exercice 2
- Dans la classe **Division**, écrire une méthode avec la signature ``` public double division2(int a, int b)``` qui calcule la division de a par b et qui capture l'exception **exacte** levée à l'exercice 1 et qui la traite en affichant un message d'erreur directement dans la méthode division2(). En cas d'erreur, la méthode doit retourner un double... choisissez une valeur adequat (nous verrons à l'exercice 3 si c'est une bonne idée…).
- Dans **Execute**, compléter la méthode **exercice2()** pour appeler division2(int a, int b) avec a=10 et b=0, et afficher le résultat
- Dans main(), commenter l'appel à exercice1() et décommenter l'appel à exercice2(), puis exécuter main()

> Pensez a faire un commit !!

### Exercice 3

On vous demande maintenant de forcer les développeurs qui vont utiliser votre méthode de division à gérer les divisions par zéro. Or, l'ArithmeticException est *Unchecked* : c'est pour ça que vous avez pu écrire division1() sans être forcé de capturer d'exception. 
Il faut donc qu'en cas de division par zéro, une exception *checked* soit levée comme, par exemple, **IOException** (on ne créé pas encore sa propre classe d'exception) : 

- Dans la classe **Division**, écrire une méthode ``` public double division3(int a, int b) throws IOException``` qui calcule la division de a par b et qui capture l'exception **exacte** levée à l'exercice 1 et qui leve à la place une exception de type **IOException** avec un message explicite. 
- Dans **Execute**, compléter la méthode **exercice3()** pour appeler division3(int a, int b) avec a = 10 et b = 0. Le compitlateur vous oblige à gérer l'exception : capturez-la et afficher le message.
- Dans main(), commenter l'appel à exercice2() et décommenter l'appel à exercice3(), puis exécuter main()

Laquelle des 3 solutions vous parait la plus pertinente ? Expliquez-le dans un commentaire au-dessus de la méthode division1(), division2() ou division3().

> Pensez a faire un commit !!

### Exercice 4

Le but est d'écrire un fichier texte *etudiants.csv* contenant une liste d'étudiants du type : "INE","Nom","Prenom"

- Créer une classe **Etudiants** avec 3 attributs : ine, nom, prenom 
  - Ajouter le/les constructeurs et accesseurs que vous jugez pertinent. 
  - Redéfinir également la méthode *toString()* pour qu'elle retourne la chaine "INE","Nom","Prenom"  suivie d'un retour à ligne. Respecter les guillemets et virgule. INE, Nom, Prenom représentent les VRAIS valeurs des attributs de l'étudiant (Pour afficher un guillement dans une chaine, il faut le préfixer... cours 1). 
- Créer un classe **EtudiantService**
  - Ajouter une méthode avec la signature ```public void sauve(Etudiant[] etudiants, String cheminCompletFichier) throws IOException``` et écrire le code qui écrit le fichier à l'aide des classes du package java.nio.file. Si le fichier existe déjà, supprimez-le avant de le recréer. Vous pouvez écrire le fichier ligne par ligne, en utilisant la méthode toString() ci dessus.
- Dans **Execute**, completer la méthode **exercice4()** pour créer quelques étudiants et générer le fichier etudiants.csv (chemin relatif, le fichier sera créé à la racine du projet)
- Dans main(), commenter / décommenter les appels pour exécuter la méthode exercice4()

> Pensez a faire un commit !!

### Exercice 5
- Dans la classe **EtudiantService**, ajouter une méthode ```public Etudiant[] charge(String cheminCompletFichier)  throws IOException```  et écrire le code qui lit le fichier créer a l'exercice 4 à l'aide des classes du package java.nio.file. Cette méthode doit convertir chaque ligne en objet Etudiant à partir des données extraites, et retourner un tableau d'Etudiant. Vous pouvez utiliser des méthodes de découpage et modification de chaînes pour découper chaque chaine et supprimer les caractères inutiles.
- Dans Execute, compléter la méthode exercice5() pour lire le fichier etudiants.csv et afficher le nom de chaque étudiant importé
- Dans main(), commenter / décommenter les appels pour exécuter la méthode exercice5()

> Pensez a faire un commit !!
