package enumDemo;

import java.util.ArrayList;
import java.util.Scanner;


public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextInt());
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            list.add(scanner.nextLine());
        }
        int deleteNum = scanner.nextInt();
        ArrayList<Mulu> muluList = new ArrayList();
        for (String str : list) {
            String[] split = str.split(" ");
            Mulu mulu = new Mulu();
            mulu.setSon(Integer.valueOf(split[0]));
            mulu.setParent(Integer.valueOf(split[1]));

            if (mulu.getParent() != 0) {
                muluList.add(mulu);
            }
        }
        ArrayList<Integer> deleteList = new ArrayList();
        deleteList.add(deleteNum);
        for (int i = 0; i < muluList.size(); i++) {
            for (int j = 0; j < deleteList.size(); j++) {
                if (deleteList.get(j) == muluList.get(i).getSon()) {
                    muluList.remove(i);
                    break;
                }
                if (deleteList.get(j) == muluList.get(i).getParent()) {
                    deleteList.add(muluList.get(i).getSon());
                    muluList.remove(i);
                    i=0;
                    break;
                }


            }

        }
        for (Mulu mulu : muluList) {
            System.out.println(mulu.getSon() + " " + mulu.getParent());

        }

    }

    static class Mulu {
        int son;

        int parent;

        public int getSon() {
            return son;
        }

        public void setSon(int son) {
            this.son = son;
        }
        public int getParent() {
            return  parent;
        }

        public void setParent(int parent) {
            this.parent = parent;
        }

    }

}
