public class StackTugasMahasiswa15 {
    Mahasiswa15[] stack; 
    int size;
    int top;

    public StackTugasMahasiswa15(int size){
        this.size = size;
        stack = new Mahasiswa15[size];
        top = -1;
    }
    public boolean isFull(){
        if (top == size-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    public void push (Mahasiswa15 mhs){
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        }else {
            System.out.println("stack penuh! tidak bisa menambahkan tugas lagi.");
        }
    }
    public Mahasiswa15 pop() {
        if (!isEmpty()) {
            Mahasiswa15 m = stack [top];
            top--;
            return m;
        }else {
            System.out.println("stack kosong! tidak ada tugas untuk dinilai.");
            return  null;
        }
    }
    public Mahasiswa15 peek(){
        if (!isEmpty()){
            return stack [top];
        }else {
            System.out.println("stack kosong! tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    public void print(){
        for(int i = top; i >= 0; i--){
            System.out.println(stack[i].nama+ "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
    }
    public Mahasiswa15 lihatTugasTerbawah(){
        if (!isEmpty()){
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }
    public int jumlahTugas(){
        return top + 1;
    }
    public void konversiDesimalKeBiner(int kode) {
        StackKonversi15 biner = new StackKonversi15(32);
    
        while (kode != 0) {
            int sisa = kode % 2;
            biner.push(sisa);
            kode = kode / 2;
        }
    
        System.out.print("Nilai dalam biner: ");
        while (!biner.isEmpty()) {
            System.out.print(biner.pop());
        }
        System.out.println();
    }
    
}
