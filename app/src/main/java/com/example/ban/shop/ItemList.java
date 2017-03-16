package com.example.ban.shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ban on 2017-03-16.
 */

public class ItemList {

    List<Itemname> item ;

    public void initData() {

        item = new ArrayList<>();




        item.add(new Itemname("수페르가 [초경량150g]수페르가 17S/S 남녀공용슈즈 2750 COTU SLIPON SUPERLIGHT S00AL60999(BLACK)", R.drawable.a));
        item.add(new Itemname("수페르가 수페르가 남성슈즈 2343 COTVACCHETTAM SEOK S00B1X0202(Green Military)", R.drawable.b));
        item.add(new Itemname("수페르가 수페르가 여성 키높이 슈즈 2735-COTSTRPW ESOM S00BZY0354(Blue lt Sky)", R.drawable.c));
        item.add(new Itemname("수페르가 16 S/S 수페르가 여성슈즈 2750 COTMETU S002HG0031(SILVER)", R.drawable.d));
        item.add(new Itemname("수페르가 [초경량150g]수페르가 17S/S 여성슈즈 2750 COTU SLIPON SUPERLIGHT S00AL60V08(PINK PALE)", R.drawable.e));
        item.add(new Itemname("수페르가 수페르가 남성슈즈 2343 COTVACCHETTAM SEOK S00B1X0912(Ecru)", R.drawable.f));
        item.add(new Itemname("수페르가 수페르가 여성키높이슈즈 2735-COTSTRPW ESOM S00BZY0903(White-Cobalt Blue)", R.drawable.g));
        item.add(new Itemname("수페르가 [초경량150g]수페르가 17S/S 여성슈즈 2750 COTU SLIPON SUPERLIGHT S00AL60354(BLUE IT SKY)", R.drawable.h));
        item.add(new Itemname("수페르가 [초경량150g]수페르가 17S/S 남녀공용슈즈 2750 COTU SLIPON SUPERLIGHT S00AL60901(WHITE)", R.drawable.i));
        item.add(new Itemname("수페르가 수페르가 여성키높이슈즈 2735-COTSTRPW ESOM S00BZY0V08(Pink Pale)", R.drawable.j));

    }

    public List<Itemname> getItem() {
        return item;
    }

}
