package exemplo.faculdade;

public class Reitor extends EmpregadoDaFaculdade {

	@Override
	public String getInfo() {
		return super.getInfo() + " e ele é um reitor";
	}

}
