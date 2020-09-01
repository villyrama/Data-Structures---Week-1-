
public class Point {
	int x, y, z;
	Point(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
}

class Geometry{
	Point[] points;
	
	static double getPathLength (Point[] points) {
		double pathLength = 0;
		for(int  i = 0; i < points.length; i++) {
			pathLength = pathLength + Math.sqrt(Math.pow(points[i + 1].x - points[i].x, 2)
					+ Math.pow(points[i + 1].y - points[i].y, 2)
					+ Math.pow(points[i + 1].z - points[i].z, 2));
		}
		return pathLength;
	}
}
