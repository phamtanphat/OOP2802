package khoapham.ptp.phamtanphat.oop;

import android.os.Build;

public class User {
    private String ten;
    private int tuoi;
    private String diachi;

    public User(Builder builder) {
        this.ten = builder.ten;
        this.tuoi = builder.tuoi;
        this.diachi = builder.diachi;
    }

    static class Builder{
        private String ten;
        private int tuoi;
        private String diachi;

        public String getTen() {
            return ten;
        }

        public Builder setTen(String ten) {
            this.ten = ten;
            return this;
        }

        public int getTuoi() {
            return tuoi;
        }

        public Builder setTuoi(int tuoi) {
            this.tuoi = tuoi;
            return this;
        }

        public String getDiachi() {
            return diachi;
        }

        public Builder setDiachi(String diachi) {
            this.diachi = diachi;
            return this;
        }
        public User create(){
            return new User(this);
        }
    }
}
