# RIONDE Antoine & ARNAUD Elian
## S2A
###

### _TP 11_

#### Question 11
Le problème avec cette méthode de tri est qu'elle ne fonctionne qu'avec des Strings il faudrait changer la
4ème ligne de la méthode pour qu'elle fonctionne avec des entiers.
###

### _TP 12_

#### Question 3
1. Si nous devions ajouter une nouvelle méthode de tri,
nous devrions modifier la classe `Magasin` ainsi que le
`MainChargeurMagasin`.
2. Cela n'est pas facile à maintenir puisqu'à chaque nouvelle
méhode de tri, il faudrait ajouter une nouvelle méthode.

#### Question 4
1. Pour créer la méthode `trierArtiste` dans la classe `Magasin`, 
nous avons effectué un copié-collé de la méthode `trierAlbum`.
2. La totalité du code a été copié-collé. Seulement la condition
dans le `if` a changé.
3. Si une des parties copiés-collés venaient à bugger, cela
signifierait que chaque méthode de tri contiennent un bug qui
devrait être corrigé.

#### Question 5
1. Le code commun est toute la méthode de tri précisement. 
2. La seule chose qui différe est l'objet qui est comparée dans
la condition `if`.

#### Question 6
En changeant le type de tri celà modifierai toute la stucture du
code ce qui signifierait que rien ne serait à conserver
expecté la ligne où on instancie une variable temporaire.
