public class Pc implements Comparable<Pc> {


        private int id;
        private String cpu;
        private String ram;
        private String storage;
        private String lcdMaker;
        private boolean hasGpu;

        Pc(int id,String cpu,String ram,String storage,String lcdMaker,boolean hasGpu){
            this.id=id;
            this.cpu=cpu;
            this.ram=ram;
            this.storage=storage;
            this.lcdMaker=lcdMaker;
            this.hasGpu=hasGpu;}

        Pc(Pc p){
            this.id=p.id;
            this.cpu=p.cpu;
            this.ram=p.ram;
            this.storage=p.storage;
            this.lcdMaker=p.lcdMaker;
            this.hasGpu=p.hasGpu;}

    public int getID(){
            return id;

    }
    public void setID(int id){
            this.id = id;
    }
        @Override

        public String toString(){

            return String.format("ID: %d\n Cpu: %s\n Ram: %s\n Storage: %s\n lcd Maker: %s\n Has Gpu: %b\n",id,cpu,ram,storage,lcdMaker,hasGpu);}

        @Override

        public Object clone(){

            Pc clone = new Pc( id,cpu,ram,storage,lcdMaker,hasGpu);
            return clone;}

        @Override

        public boolean equals(Object o){
            Pc p = (Pc)o;
            if( p==null)
                return false;
            return this.id==p.id&& this.cpu.equals(p.cpu)&&this.ram.equals(p.ram)&&this.storage.equals(p.storage)&&this.lcdMaker.equals(p.lcdMaker)&&this.hasGpu==p.hasGpu;
        }


    @Override
    public int compareTo(Pc other) {
        return Integer.compare(this.id, other.id);
    }
}


