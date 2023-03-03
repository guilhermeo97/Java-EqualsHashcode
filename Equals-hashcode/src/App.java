public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        person guilherme = new person("Guilherme", "Oliveira", "preto", "preto", null, 'M', 50f, 170f);
        person mario = new person("Guilherme", "Oliveira", "preto", "preto", null, 'M', 50f, 171f);
        person joana = new person("Joana", "Silveira", "preto", "preto", null, 'F', 50f, 160f);
        person joao = guilherme;
        
        guilherme.setThought("Ferias em Fernando de Noronha");
        mario.setThought("Ferias em cabo frio");

        System.out.println(guilherme.hashCode());
        System.out.println(mario.hashCode());
        System.out.println(guilherme.toString());
        joao.setAge(40);
        joana.setAge(2010, 2023);

        //System.out.println(guilherme == joao);
        //System.out.println(guilherme.equals(mario));
        //System.out.println(joao.hashCode());
        //System.out.println(mario.hashCode());

        


    }
}

class person {
    private String name, lastName, eyeColor, hairColor, skinColor;
    private char gender;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(int birth, int year){
        this.age = year - birth;
    }

    private float weight, height;
    private String thought;

    public person(String name, String lastName, String eyeColor, String hairColor, String skinColor, char gender,
            float weight, float height) {
        this.name = name;
        this.lastName = lastName;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.skinColor = skinColor;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThought() {
        return thought;
    }
    
    public void setThought(String thought) {
        this.thought = thought;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((eyeColor == null) ? 0 : eyeColor.hashCode());
        result = prime * result + ((hairColor == null) ? 0 : hairColor.hashCode());
        result = prime * result + ((skinColor == null) ? 0 : skinColor.hashCode());
        result = prime * result + gender;
        result = prime * result + Float.floatToIntBits(weight);
        result = prime * result + Float.floatToIntBits(height);
        result = prime * result + ((thought == null) ? 0 : thought.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        person other = (person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (eyeColor == null) {
            if (other.eyeColor != null)
                return false;
        } else if (!eyeColor.equals(other.eyeColor))
            return false;
        if (hairColor == null) {
            if (other.hairColor != null)
                return false;
        } else if (!hairColor.equals(other.hairColor))
            return false;
        if (skinColor == null) {
            if (other.skinColor != null)
                return false;
        } else if (!skinColor.equals(other.skinColor))
            return false;
        if (gender != other.gender)
            return false;
        if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
            return false;
        if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
            return false;
        if (thought == null) {
            if (other.thought != null)
                return false;
        } else if (!thought.equals(other.thought))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "person [name=" + name + ", lastName=" + lastName + ", eyeColor=" + eyeColor + ", hairColor=" + hairColor
                + ", skinColor=" + skinColor + ", gender=" + gender + ", age=" + age + ", weight=" + weight
                + ", height=" + height + ", thought=" + thought + "]";
    }



    
    
    
    //@Override
    //public boolean equals(Object o){
    //    person objeto = (person)o;
    //    return true;
    //}
}


