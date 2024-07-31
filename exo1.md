### A. Théorie

#### 1. Que signifie l’annotation @Override ?
L'annotation `@Override` est utilisée en Java pour indiquer que la méthode annotée est censée redéfinir une méthode dans une superclasse. Cette annotation n'est pas obligatoire, mais elle permet de bénéficier de certains avantages 


#### 2. Pourquoi est-ce qu’on a souvent besoin de redéfinir equals et hashCode ?
- **`equals`** : Permet de définir les critères d'égalité entre deux objets. Par défaut, `equals` dans la classe `Object` compare les références (adresses mémoire) des objets. En le redéfinissant, on peut comparer les valeurs des attributs des objets.
  
- **`hashCode`** : Retourne un entier (code de hachage) représentant l'objet. Lorsque `equals` est redéfini, il est crucial de redéfinir aussi `hashCode` pour assurer que deux objets égaux ont le même code de hachage. Ceci est important pour le bon fonctionnement des collections basées sur le hachage.

#### 3. Qu’est-ce que le polymorphisme statique ? Donnez un exemple.
Le polymorphisme statique, également appelé polymorphisme de compilation, se réfère à la capacité d'une fonction ou d'une méthode à prendre différentes formes au moment de la compilation. Cela est principalement réalisé par la surcharge des méthodes (overloading).

La surcharge des méthodes permet de définir plusieurs méthodes dans la même classe avec le même nom mais des signatures différentes (différents types et/ou nombre de paramètres).

Exemple :
```java
class MathUtil {
    static int additionner(int a, int b) {
        return a + b;
    }

    static double additionner(double a, double b) {
        return a + b;
    }

    static int additionner(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtil.additionner(2, 3)); // Appelle additionner(int, int)
        System.out.println(MathUtil.additionner(2.5, 3.5)); // Appelle additionner(double, double)
        System.out.println(MathUtil.additionner(1, 2, 3)); // Appelle additionner(int, int, int)
    }
}
```

Dans cet exemple, la méthode `additionner` est surchargée trois fois, ce qui illustre le polymorphisme statique.