package report;

import recipe.Recipe;
import user.RegisteredUser;

public class ReportRecipe extends Report {
	
	private Recipe reportedRecipe;
	
	public ReportRecipe(RegisteredUser reporting, String justification, Recipe reportedRecipe) {
		super(reporting, justification);
		this.reportedRecipe = reportedRecipe;
	}

	public Recipe getReportedRecipe() {
		return reportedRecipe;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("User " + getReporting() + " has reported ");
		sb.append("the recipe " + reportedRecipe + ".\n");
		sb.append("Justification: " + getJustification() + "\n");
		
		return sb.toString();
	}
	
	public String toStringExtended() {
		StringBuilder sb = new StringBuilder();
		sb.append(this);
		sb.append("Reported recipe: \n");
		sb.append(reportedRecipe.toString());
		
		return sb.toString();
	}
}
