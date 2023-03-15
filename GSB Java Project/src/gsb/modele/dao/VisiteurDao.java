package gsb.modele.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import gsb.modele.Visiteur;
import gsb.modele.Localite;
import gsb.modele.Medecin;

public class VisiteurDao {
	
	public static Visiteur rechercher(String matricule){
		// Création des objets Visiteur et Localite pour y stocker les valeurs de la table VISITEUR
		Visiteur unVisiteur=null;
		Localite uneLocalite=null;
		
		
		// Exécution de de la requête et stockage du résultat dans un objet ResulSet
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from VISITEUR where MATRICULE ='"+matricule+"'");
		try {
			// Pour tout les résultats existant dans la table reqSelection, les parcourir
			if (reqSelection.next()) {
				
				// Construction des objets avec les valeurs reçues dans la table reqSelection
				uneLocalite = new Localite(reqSelection.getString(7), null);
				unVisiteur = new Visiteur(reqSelection.getString(1), reqSelection.getString(2),reqSelection.getString(3),reqSelection.getString(4),reqSelection.getString(5),reqSelection.getString(6),reqSelection.getString(8),reqSelection.getString(9),reqSelection.getString(10),reqSelection.getString(11),reqSelection.getInt(12),uneLocalite);
				unVisiteur.setUneLocalite(uneLocalite);
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from LOCALITE where CODEPOSTAL='"+matricule+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		
		return unVisiteur;
	}
	
	public static int creerVisiteur(Visiteur unVisiteur) {
		Localite uneLocalite = unVisiteur.getUneLocalite();
		int resultat = ConnexionMySql.execReqMaj("insert into VISITEUR values ('"+unVisiteur.getMatricule()+"', '"+unVisiteur.getNom()+"', '"+unVisiteur.getPrenom()+"', '"+unVisiteur.getLogin()+"', '"+unVisiteur.getMdp()+"','"+unVisiteur.getAdresse()+"','"+uneLocalite.getCodePostal()+"','"+unVisiteur.getDateEntree()+"','"+unVisiteur.getCodeUnite()+"','"+unVisiteur.getNomUnite()+"','"+unVisiteur.getTelephone()+"',"+unVisiteur.getPrime()+")");
		return resultat;
	}
	
	public static ArrayList<Visiteur> retournerCollectionVisiteur() {
		ArrayList<Visiteur> lesVisiteurs = new ArrayList<Visiteur>();
		Visiteur unVisiteur=null;
		Localite uneLocalite=null;
		
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from VISITEUR");
			try {
				// Pour tout les résultats existant dans la table reqSelection, les parcourir
				while (reqSelection.next()) {
				
					// Construction des objets avec les valeurs reçues dans la table reqSelection
					uneLocalite = new Localite(reqSelection.getString(7), null);
					unVisiteur = new Visiteur(reqSelection.getString(1), reqSelection.getString(2),reqSelection.getString(3),reqSelection.getString(4),reqSelection.getString(5),reqSelection.getString(6),reqSelection.getString(8),reqSelection.getString(9),reqSelection.getString(10),reqSelection.getString(11),reqSelection.getInt(12),uneLocalite);
					unVisiteur.setUneLocalite(uneLocalite);
					lesVisiteurs.add(unVisiteur);
				}
			}
				catch(Exception e) {
					System.out.println("erreur reqSelection.next() pour la requ�te - select * from VISITEUR");
					e.printStackTrace();
					}
				ConnexionMySql.fermerConnexionBd();
				
		return lesVisiteurs;
	}
	
	public static HashMap<String,Visiteur> retournerDictionnaireDesVisiteurs(){
		HashMap<String, Visiteur> diccoDesVisiteurs = new HashMap<String, Visiteur>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select MATRICULE from VISITEUR");
		try{
		while (reqSelection.next()) {
			String matriculeVisiteur = reqSelection.getString(1);
			diccoDesVisiteurs.put(matriculeVisiteur, VisiteurDao.rechercher(matriculeVisiteur));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDictionnaireDesVisiteurs()");
		}
		return diccoDesVisiteurs;
	}
	
	// Cette méthode vérifie si l'utilisateur existe déjà dans la base de donnée, renvoie TRUE s'il existe, FALSE dans le cas contraire
	public static boolean checkIfVisiteurExist(String matricule) {
		boolean exist = false;
		// Requête SQL qui va chercher dans la table visiteur, un visiteur avec le matricule transmis en paramètre
		String request = "SELECT * FROM visiteur WHERE matricule = '"+matricule+"'";
		
		// Exécution de la requête SQL, le résultat est renvoyé dans un objet ResultSet
		ResultSet reqSelection = ConnexionMySql.execReqSelection(request);
		
		// Vérification si le résultat est vide ou non
		try {
			if(reqSelection.next()) {
				// Si la condition est vérifié, alors le visiteur existe bien en base de donnée
				exist = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Retourner la variable "exist"
		return exist;
 
	}
	
	
}
