public class geoNeuron{
	
	public double x,y;
	public double wx,wy;
	public int update,choose;
	
	public geoNeuron(double x,double y){
		this.x = x;
		this.y = y;
		
		this.wx = Math.random();
		this.wy = Math.random();
		
		update = 0;
		choose = 0;
		
	}
	
	public double dist(geoNeuron c){
		double dx = this.x - c.x;
		double dy = this.y - c.y;
		
		return Math.sqrt(dx*dx + dy*dy);
		
	}
	
	public double wdist(geoNeuron c){
		double dx = this.wx - c.wx;
		double dy = this.wy - c.wy;
		
		return Math.sqrt(dx*dx + dy*dy);
		
	}

}
