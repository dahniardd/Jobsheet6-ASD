package jobsheet6;

public class HotelService06 {
    Hotel06 rooms[] = new Hotel06[5];
    int idx;

    void tambah(Hotel06 r){
        if(idx<rooms.length){
            rooms[idx] = r;
            idx++;
        }else{
            System.out.println("Kamar sudah penuh!");
        }
    }
    void tampil(){
        for(Hotel06 r : rooms){
            r.tampil();
            System.out.println("--------------------------");
        }
    }
    void bubbleSort(){
        for(int i=0; i<rooms.length-1; i++){
            for(int j=1; j<rooms.length-i; j++){
                if(rooms[j].harga > rooms[j-1].harga){
                    Hotel06 tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for(int i=0; i<rooms.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<rooms.length; j++){
                if(rooms[j].bintang > rooms[idxMin].bintang){
                    idxMin = j;
                }
            }
            Hotel06 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}

