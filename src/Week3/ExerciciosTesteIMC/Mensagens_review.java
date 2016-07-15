package Week3.ExerciciosTesteIMC;


public class Mensagens_review {

	private static final String MUITO_GRAVE = "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
	private static final String GRAVE = "Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
	private static final String BAIXO = "Baixo peso = IMC entre 17 e 18,49 kg/m²";
	private static final String NORMAL = "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
	private static final String SOBRE_PESO = "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
	private static final String OBESIDADE_G1 = "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
	private static final String OBESIDADE_G2 = "Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
	private static final String OBESIDADE_G3 = "Obesidade grau III (obesidade m�rbida) = IMC igual ou maior que 40 kg/m²";

	public static String getMuitoGrave() {
		return MUITO_GRAVE;
	}

	public static String getGrave() {
		return GRAVE;
	}

	public static String getBaixo() {
		return BAIXO;
	}

	public static String getNormal() {
		return NORMAL;
	}

	public static String getSobrePeso() {
		return SOBRE_PESO;
	}

	public static String getObesidadeG1() {
		return OBESIDADE_G1;
	}

	public static String getObesidadeG2() {
		return OBESIDADE_G2;
	}

	public static String getObesidadeG3() {
		return OBESIDADE_G3;
	}

}
