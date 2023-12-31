# Singleton-pattern-research
Singleton Pattern
Definiție
Singleton este un design pattern creational care asigură că o clasă are doar o instanță și furnizează un punct global de acces la aceasta.

Cand/Unde/De ce se folosește
Când: Singleton se folosește atunci când avem nevoie de o singură instanță a unei clase, iar accesul global la această instanță este esențial.
Unde: Este util în situații în care o singură instanță a unei clase trebuie să coordoneze acțiuni în întregul sistem, cum ar fi un manager de configurare sau un manager de conexiuni la baza de date.
De ce: Se utilizează pentru a evita crearea mai multor instanțe ale unei clase, economisind resurse și asigurând coerența datelor.

Pro vs. Contra
Pros:
Unic în sistem: Asigură existența unei singure instanțe în cadrul sistemului.
Acces global: Furnizează un punct global de acces la instanță, facilitând comunicarea între diferite componente ale sistemului.
Lazy Loading: Permite încărcarea instanței doar atunci când este necesar, economisind resurse.

Cons:
Probleme de performanță: Utilizarea unui Singleton poate cauza potențiale probleme de performanță, în special în aplicațiile concurente.
Abuzul poate duce la design defectuos: Utilizarea excesivă a Singleton-ului poate indica o proiectare defectuoasă, legând în mod rigid diferite componente.

Cazuri Speciale
Singleton cu Lazy Initialization: Oferă o instanță a clasei doar atunci când este necesar, amânând crearea ei până în momentul utilizării pentru a economisi resurse.
Singleton cu Double-Checked Locking: Abordează problemele de performanță în mediile concurente prin utilizarea unei verificări duble pentru a asigura atomicitatea inițializării.
