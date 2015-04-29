
public class program {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Globais.d.put(Globais.d.size(), "Segunda-Feira");
		Globais.d.put(Globais.d.size(), "Terça-Feira");
		Globais.d.put(Globais.d.size(), "Quarta-Feira");
		Globais.d.put(Globais.d.size(), "Quinta-Feira");
		Globais.d.put(Globais.d.size(), "Sexta-Feira");
		Globais.d.put(Globais.d.size(), "Sabado");
		Globais.d.put(Globais.d.size(), "Domingo");
		
		for(int i : Globais.d.keySet())
		{
			System.out.println(i+"-"+Globais.d.get(i));
			
		}
		
	}

}
