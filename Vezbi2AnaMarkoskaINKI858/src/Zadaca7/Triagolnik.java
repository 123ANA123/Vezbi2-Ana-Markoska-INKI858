package Zadaca7;

public class Triagolnik {
public double a, b, c;
public double s;
public float m;


public double Perimetar() {
return (a + b + c);

}

public double Poluperimetar() {
return s = ((a + b + c)/2);
}

public double Plostina() {
return Math.sqrt(Poluperimetar()*(Poluperimetar() - a)*(Poluperimetar() - b)*(Poluperimetar() - c));
}


}
