package data.api.iot.entities;

import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class Lrrs {

	@Embedded
	private List<Lrr> lrr = new ArrayList<Lrr>();
	
	public Lrrs() {
		
	}
	
	public Lrrs(List<Lrr> lrr) {
		this.lrr = lrr;
	}	
	
}
