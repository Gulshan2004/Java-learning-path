class Lap {
    String model;
    int price;

    public String toString() {
        return "Lap [model=" + model + ", price=" + price + "]";
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lap other = (Lap) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // public boolean equals(Lap that) {
    //     return this.model.equals(that.model) && this.price == that.price;

    // }
}

public class ObjectClass {
    public static void main(String args[]) {
        Lap obj1 = new Lap();
        obj1.model = "Yoga";
        obj1.price = 1000;
        // System.out.println(obj1.toString());
        // Every time we try to print the object it will call toString() method eve if
        // we dont mention it, it is a part of the Object.class of java .
        // The toString method for class Object returns a string consisting of the name
        // of the class of which the object is an instance, the at-sign character `@',
        // and the unsigned hexadecimal representation of the hash code of the object.
        // In other words, this method returns a string equal to the value of:
        // getClass().getName() + '@' + Integer.toHexString(hashCode());

        Lap obj2 = new Lap();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;
        // System.out.println(obj2);

        boolean result = obj1.equals(obj2);
        System.out.println(result);
    }
}
