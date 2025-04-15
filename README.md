<h1 align="center">📊 Rapport TP Spring - Injection de Dépendances</h1>

<h2>🎯 Objectifs du TP</h2>
Ce TP avait pour but de maîtriser l'injection de dépendances avec Spring à travers 4 approches différentes : manuelle, dynamique, par annotations et via XML. L'application simule un calcul métier basé sur des données fournies par un DAO.

<h2>🧩 Structure du Projet</h2>

<h3>🔹 Couche DAO</h3>
Nous avons créé :
- Une interface `IDao` avec la méthode `getData()`
- Deux implémentations : 
  - `DaoImpl` (simulant une base de données)
  - `DaoImplV2` (simulant des capteurs)
Chaque implémentation retourne une valeur différente pour démontrer l'injection dynamique.

<h3>🔹 Couche Métier</h3>
L'interface `IMetier` et son implémentation `IMetierImpl` réalisent un calcul complexe en utilisant :
- L'injection par constructeur.
- L'injection par setter.
- L'injection par annotation `@Autowired`.

<h3>🔹 Couche Présentation</h3>
4 méthodes d'injection ont été testées :

1. **Injection manuelle** (`Pres1`)  
   Instanciation directe des dépendances sans conteneur Spring.

2. **Injection dynamique** (`Pres2`)  
   Utilisation de la réflexion Java pour charger les classes depuis un fichier config.txt.

3. **Spring par Annotations** (`PresSpringAnnotation`)  
   Configuration automatique via le scan de packages et annotations (`@Repository`, `@Service`).

4. **Spring par XML** (`PresSpringXML`)  
   Déclaration explicite des beans dans le fichier config.xml.

<h2>📝 Observations Clés</h2>
- **Spring simplifie grandement** la gestion des dépendances
- **L'injection par constructeur** est la plus sûre (dépendances obligatoires)
- **Le fichier XML** offre une configuration centralisée mais verbeuse
- **Les annotations** réduisent la configuration au prix d'une moins bonne visibilité

<h2>✅ Ce Que J'ai Appris</h2>
- Différencier couplage fort/faible
- Implémenter l'IoC sans Spring
- Configurer Spring via XML et annotations
- Choisir le type d'injection selon le contexte

<h3>👩‍💻 Auteure</h3>
Wiame Anejjar
