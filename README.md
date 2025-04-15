<h1 align="center">📊 Rapport TP Spring - Injection de Dépendances</h1>

<h2>🎯 Objectifs du TP</h2>
Ce TP avait pour objectif de maîtriser l'injection de dépendances avec Spring à travers 4 approches différentes : manuelle, dynamique, par annotations et via XML. L'application simule un calcul métier basé sur des données fournies par un DAO.

<h2>🧩 Structure du Projet</h2>

<h3>🔹 Couche DAO</h3>
Nous avons créé :
- Une interface `IDao` avec la méthode `getData()`.<br>    
- Deux implémentations :   <br>  
  - `DaoImpl` (simulant une base de données)<br>    
  - `DaoImplV2` (simulant des capteurs)  <br>  
Chaque implémentation retourne une valeur différente pour démontrer l'injection dynamique.<br>  

<h3>🔹 Couche Métier</h3>
L'interface `IMetier` et son implémentation `IMetierImpl` réalisent un calcul en utilisant :  <br>  
- L'injection par constructeur.  <br>  
- L'injection par setter.  <br>  
- L'injection par annotation `@Autowired`.<br>    

<h3>🔹 Couche Présentation</h3>
4 méthodes d'injection ont été testées :

1. **Injection manuelle** (`Pres1`)  
   Instanciation directe des dépendances sans conteneur Spring. Nous instancions directement l'implémentation DaoImplV2 et l'injectons via le constructeur de IMetierImpl. Cette approche présente l'avantage d'être simple à comprendre mais crée un couplage fort entre les composants, ce qui réduit la flexibilité et la maintenabilité du code. 


2. **Injection dynamique** (`Pres2`)  
   Utilisation de la réflexion Java pour charger les classes depuis un fichier config.txt. Le programme lit le fichier contenant les noms complets des classes à instancier (net.anejjar.ext.DaoImplV2 et net.anejjar.metier.IMetierImpl). Grâce à Class.forName() et newInstance(), nous créons dynamiquement les objets et gérons l'injection. Cette méthode permet de modifier le comportement de l'application simplement en éditant le fichier texte, sans recompilation.  

3. **Spring par Annotations** (`PresSpringAnnotation`)  
   Configuration automatique via le scan de packages et annotations (`@Repository`, `@Service`,`@Component`).Le contexte d'application scanne automatiquement le package net.anejjar pour détecter les composants marqués avec @Repository et @Service ou @Component. L'injection se fait automatiquement grâce à @Autowired. Cette approche moderne réduit considérablement la configuration tout en offrant une grande flexibilité.  

4. **Spring par XML** (`PresSpringXML`)  
   Déclaration explicite des beans dans le fichier config.xml.Chaque bean est défini avec son ID et sa classe complète, et les dépendances sont spécifiées via des balises <constructor-arg>. Bien que plus verbeuse que les annotations, cette méthode offre une configuration centralisée et modifiable sans recompiler le code.  

<h2>📝 Observations Clés</h2>
- **Spring simplifie grandement** la gestion des dépendances <br>     
- **L'injection par constructeur** est la plus sûre (dépendances obligatoires)<br>      
- **Le fichier XML** offre une configuration centralisée mais verbeuse    <br>  
- **Les annotations** réduisent la configuration au prix d'une moins bonne visibilité  <br>    

<h2>✅ Ce Que J'ai Appris</h2>
- Différencier couplage fort/faible <br>     
- Implémenter l'IoC sans Spring   <br>   
- Configurer Spring via XML et annotations  <br>    
- Choisir le type d'injection selon le contexte <br>     
<h2>Conclusion</h2>
Ce TP m'a permis d'explorer en profondeur les différentes techniques d'injection de dépendances. Chaque méthode a ses forces et faiblesses, et le choix dépendra des besoins spécifiques du projet. Spring Framework, avec ses deux modes de configuration (annotations et XML), offre une solution complète et professionnelle pour gérer les dépendances dans les applications Java.

<h3> Auteure :</h3>
Wiame Anejjar
