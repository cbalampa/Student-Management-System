# Student Management System

Πίνακας Περιεχομένων
=================
* [Περιγραφή Εφαρμογής](#περιγραφή-εφαρμογής)
* [Τεχνολογίες](#τεχνολογίες)
* [Setup](#setup)
* [Λειτουργίες](#λειτουργίες)

## Περιγραφή Εφαρμογής
Σκοπός τοu project είναι η υλοποίηση ενός Πληροφοριακoύ Συστήματος Μηχανογράφησης που αφορά Γυμνάσια/Λύκεια με τη χρήση διαφόρων τεχνολογιών. Πιο συγκεκριμένα, γίνεται χρήση μιας απομακρυσμένης σχεσιακής Βάσης Δεδομένων η οποία διαχειρίζεται δεδομένα σχετικά με οντότητες που απαρτίζουν ένα σχολείο. Μέσω του συστήματος αυτού, ο διαχειριστής έχει την δυνατότητα να εκτελεί ενέργειες όπως η προσθήκη ενός νεοεισαχθέντα μαθητή, η διαγραφή ενός καθηγητή, η ενημέρωση των βαθμολογιών, κ.ο.κ..

## Τεχνολογίες
Για την δημιουργία του project χρησιμοποιήθηκαν οι παρακάτω τεχνολογίες:
- Java
- JDBC
- PL/SQL

## Setup
Μπορείτε να δοκιμάσετε το project κατεβάζοντας απλά τα αρχεία που θα βρείτε στον παρακάτω σύνδεσμο:
[https://drive.google.com/drive/folders/1pJ5gunGfKSx0DVSlSLpo50qVZFlNLviE?usp=sharing](https://drive.google.com/drive/folders/1pJ5gunGfKSx0DVSlSLpo50qVZFlNLviE?usp=sharing)

Αφού έχετε κατεβάσει τα απαραίτητα αρχεία κάντε διπλό-κλικ στο εκτελέσιμο jar αρχείο με όνομα TBD2021, το οποίο βρίσκεται μέσα στο φάκελο dist. Περαιτέρω πληροφορίες για την επιτυχή σύνδεση σας με την βάση δεδομένων βρίσκονται μέσα στο αρχείο README.

## Βάση Δεδομένων
Η βάση αποτελείται από ένα σύνολο οκτώ πινάκων οι οποίοι σχετίζονται μεταξύ τους με τη χρήση ξένων κλειδιών όπως φαίνεται στην παρακάτω εικόνα.


![Database Diagram](https://user-images.githubusercontent.com/73292440/124173684-094de380-dab4-11eb-8797-acdd8573c0d5.png)


## Λειτουργίες
Manage Students
- Εισαγωγή μαθητή στη βάση δεδομένων
- Επεξεργασία/ενημέρωση στοιχείων μαθητή
- Διαγραφή μαθητή από την βάση δεδομένων
- Εύρεση μαθητή (δυναμικά μέσω search bar)
 
Manage Teachers
- Εισαγωγή καθηγητή στη βάση δεδομένων
- Επεξεργασία/ενημέρωση στοιχείων καθηγητή
- Διαγραφή καθηγητή από την βάση δεδομένων
- Εύρεση καθηγητή (δυναμικά μέσω search bar)

Manage Classrooms
- Δημιουργία τάξεων
- Διαγραφή τάξεων
- Γέμισμα τάξεων με μαθητές
- Αλλαγή τάξης μαθητή

Manage Courses
- Εισαγωγή μαθημάτων στην βάση δεδομένων
- Διαγραφή μαθημάτων από την βάση δεδομένων
- Ανάθεση καθηγητή σε μάθημα
- Αλλαγή ανάθεσης μαθήματος σε καθηγητή
- Διαγραφή σχέσης καθηγητή - μαθήματος

Manage Grades
- Αλλαγή βαθμού μαθητή
- Bonus: Λεπτομέρειες (best student, top five students)


<img src="https://user-images.githubusercontent.com/73292440/124302250-9dc64d80-db69-11eb-9cbc-7721ea3faeb0.gif" alt="drawing" width="600"/>

