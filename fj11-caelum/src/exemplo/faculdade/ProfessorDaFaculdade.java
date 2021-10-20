package exemplo.faculdade;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
	private int horasDeAula;
	
	@Override
	public double getGastos() {
		return this.getSalario() + this.horasDeAula * 10;
		}
	@Override
	public String getInfo() {
		String informacaoBasica = super.getInfo();
		String informacao = informacaoBasica + " horas de aula: " + this.horasDeAula;
		
		return informacao;
	}
	
	
}
