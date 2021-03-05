package polimorfismo;
	
	public class Cachorro extends Animal{
		

		public Cachorro() {
			super("Cachorro");
		}
		
		public void Nome (String nomeanimal) {
			System.out.println("Nome do cachorro: "+nomeanimal);
		}
		public void Idade (int idadeanimal) {
			System.out.println("Idade: "+idadeanimal);
		}
		public void Som (String somanimal) {
			System.out.println("Som que o seu cachorro emite: "+somanimal);
		}
		public void Corre () {
			System.out.println("Uma das caracteristicas do cachorro é correr!");
		}
		
	}


