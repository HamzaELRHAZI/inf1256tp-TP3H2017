/**
 * @author Johnny Tsheke @ UQAM --INF1256
 * 2017-04-08
 */
package h2017;
import h2017.*;

public abstract class Travailleur {
	    protected final StatutFeuille STATUT_INCONNU = StatutFeuille.INC;
	    protected final StatutFeuille STATUT_REJETE = StatutFeuille.REJ;
	    protected final StatutFeuille STATUT_ACCEPTE = StatutFeuille.ACC;
	    private int matricule = 0;
        private String nom = "";
        private String prenom = "";
        private double nhBanque = 0; //heures en banque
        private double nhTravaillees = 0; //heures travaillées
        private double nhReprises = 0; //heures reprises
        private StatutFeuille statut = this.STATUT_INCONNU; 
        private String commentaire = "";
        
        //setters et getters --implementer ces methodes dans la sous classe
        //matricule
          void setMatricule(int ma){
        	  this.matricule = ma;
          }
         public int getMatricule(){
        	 return(this.matricule);
         }
         //nom
         void setNom(String nomTrav){
        	 this.nom = nomTrav;
         }
         public  String getNom(){
        	 return (this.nom);
         }
       //prenom
          void setPrenom(String prenomTrav){
        	  this.prenom = prenomTrav;
          }
           
         public String getPrenom(){
        	 return (this.prenom);
         }
       //nhBanque
          void setNhBanque(double nhBank){
        	  this.nhBanque = nhBank;
          }
         public double getNhBanque(){
        	 return (this.nhBanque);
         }
         //nhTravaillees
         void setNhTravaillees(double nhTrav){
        	 this.nhTravaillees = nhTrav;
         }
         
         public double getNhTravaillees(){
        	 return (this.nhTravaillees);
         }
       //nhReprises
          void setNhReprises(double nhRep){
        	  this.nhReprises = nhRep;
          }
         public  double getNhReprises(){
        	 return (this.nhReprises);
         }
       //nhReprises
          void setStatut(StatutFeuille stat){
        	  this.statut = stat;
          }
         public StatutFeuille getStatut(){
        	 return (this.statut);
         }
       //commentaire
         void setCommentaire(String comment){
        	 this.commentaire = comment;
         }
         public  String getCommentaire(){
        	 return(this.commentaire);
         }
       
       //décomposition des élements a partir d'une ligne de texte
        //voir ennonce TP3 hiver 2017 pour details
        abstract void decomposerFeuilleTemps(String ligneFeuilleTemps);
        //rassembler elements pour former une ligne de texte.
        //voir ennonce TP3 H2017
        public abstract String assemblerFeuilleTemps();
        //affichage d'une donnée de heures
        abstract void afficheHeures(String message, double nbheures);
        //la methode suivante affiche les information de la feuille de temps
        //une information par ligne
        public abstract void afficheFeuilleTemps();
        
}
