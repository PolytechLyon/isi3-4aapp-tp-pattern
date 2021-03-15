package livre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Livre {
	private List<Auteur> auteurs;
	private String titre;
	private int pages;
	private Genre genre;
	private int annee;
	//private String Isbn;
	private Optional<String> isbn;
	
	public Livre(List<Auteur> auteurs, String titre, int pages, Genre genre, int annee, String isbn) {
		super();
		this.auteurs = auteurs;
		this.titre = titre;
		this.pages = pages;
		this.genre = genre;
		this.annee = annee;
		this.isbn = Optional.ofNullable(isbn);
	}
	public List<Auteur> getAuteurs() {
		return auteurs;
	}
	public void setAuteurs(List<Auteur> auteurs) {
		this.auteurs = auteurs;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public Optional<String> getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		//isbn = isbn;
		this.isbn = Optional.of(isbn);
	}
	@Override
	public String toString() {
		return "Livre [auteurs=" + auteurs + ", titre=" + titre + ", pages=" + pages + ", genre=" + genre + ", année="
				+ annee + ", Isbn=" + isbn.orElse("NO ISBN") + "]";
	}
	
	public static List<Livre> genereListe(){
		List<Auteur> auteursDiaboliques = new ArrayList<Auteur>();
		auteursDiaboliques.add(new Auteur("Boileau","Pierre","France"));
		auteursDiaboliques.add(new Auteur("Ayraud","Pierre","France"));
	
		List<Livre> livres = Arrays.asList(
			new Livre(Arrays.asList(
					new Auteur("Orwell","George","Royaume-Uni")),
					"1984",376,Genre.SCIENCEFICTION,1950, null),
			new Livre(Arrays.asList(
					new Auteur("Dick","Philip","Etats-Unis")),
					"Ubik",272,Genre.SCIENCEFICTION,1970,
					"978-0-57507-921-2"),
			new Livre(Arrays.asList(
					new Auteur("Tolkien","J.R.R.","Etats-Unis")),
					"La communauté de l'anneau",691,Genre.FANTASY,1955,null),
			new Livre(Arrays.asList(
					new Auteur("Hobb","Robin","Etats-Unis")),
					"L'apprenti assassin",510,Genre.FANTASY,1998,
					"2-29-035262-4"),
			new Livre(Arrays.asList(
					new Auteur("Martin","George R.R.","Etats-Unis")),
					"Trone de fer",694,Genre.FANTASY,1996,
					"0-553-10354-7"),
			new Livre(Arrays.asList(
					new Auteur("Christie","Agatha","Royaume-Uni")),
					"Les dix petits nègres",244,Genre.POLICIER,1939,null),
			new Livre(Arrays.asList(
					new Auteur("Harris","Thomas","Etats-Unis")),
					"Le silence des agneaux",337,Genre.POLICIER,1988,
					"0-312-02282-4"),
			new Livre(Arrays.asList(
					new Auteur("Eco","Umberto","Italie")),
					"Le nom de la rose",512,Genre.POLICIER,1980,
					"2-253-03313-8"),
			new Livre(auteursDiaboliques,
					"Les Diaboliques",241,Genre.POLICIER,1952,
					null),
			new Livre(Arrays.asList(
					new Auteur("Le Carré","John","Royaume-Uni")),
					"La taupe",411,Genre.POLICIER,1974,
					"2-020-47991-5"),
			new Livre(Arrays.asList(
					new Auteur("Follett","Ken","Royaume-Uni")),
					"Les piliers de la terre",806,Genre.HISTORIQUE,1974,
					"2-253-05953-6"),
			new Livre(Arrays.asList(
					new Auteur("Dumas","Alexandre","France")),
					"Les trois mousquetaires",700,Genre.HISTORIQUE,1844,null));
		return livres;
	}
	
	
	
}
