package com.yongdd.tarotcard.utils.objects

import android.content.Context
import androidx.appcompat.content.res.AppCompatResources
import com.yongdd.tarotcard.R
import com.yongdd.tarotcard.utils.enums.CardType
import com.yongdd.tarotcard.model.data.Tarot

object CardList {

    fun getCardList(context: Context) : MutableList<Tarot> {
        val list = mutableListOf<Tarot>()
        list.add(Tarot(0,"The Fool",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card0),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F0_the_fool.jpg?alt=media&token=b0ff8d6f-70e4-4e68-a3d2-097a5f66f57b","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_0_the_fool.jpg?alt=media&token=7fd27a60-2418-48d6-93f3-3d1cae5d5da5"))
        list.add(Tarot(1,"The Magician",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card1),"http://luciendo.cafe24.com/web/tarotcard/1_the_magician.jpg","http://luciendo.cafe24.com/web/tarotcard/m_1_the_magician.jpg"))
        list.add(Tarot(2,"The High priestess",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card2),"http://luciendo.cafe24.com/web/tarotcard/2_the_high_priestess.jpg","http://luciendo.cafe24.com/web/tarotcard/m_2_the_high_priestess.jpg"))
        list.add(Tarot(3,"The Empress",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card3),"http://luciendo.cafe24.com/web/tarotcard/3_the_empress.jpg","http://luciendo.cafe24.com/web/tarotcard/m_3_the_empress.jpg"))
        list.add(Tarot(4,"The Emperor",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card4),"http://luciendo.cafe24.com/web/tarotcard/4_the_emperor.jpg","http://luciendo.cafe24.com/web/tarotcard/m_4_the_emperor.jpg"))
        list.add(Tarot(5,"The Hierophant",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card5),"http://luciendo.cafe24.com/web/tarotcard/5_the_hierophant.jpg","http://luciendo.cafe24.com/web/tarotcard/m_5_the_hierophant.jpg"))
        list.add(Tarot(6,"The Lovers",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card6),"http://luciendo.cafe24.com/web/tarotcard/6_the_lovers.jpg","http://luciendo.cafe24.com/web/tarotcard/m_6_the_lovers.jpg"))
        list.add(Tarot(7,"The Chariot",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card7),"http://luciendo.cafe24.com/web/tarotcard/7_the_chariot.jpg","http://luciendo.cafe24.com/web/tarotcard/m_7_the_chariot.jpg"))
        list.add(Tarot(9,"Strength",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card8),"http://luciendo.cafe24.com/web/tarotcard/8_strength.jpg","http://luciendo.cafe24.com/web/tarotcard/m_8_strength.jpg"))
        list.add(Tarot(9,"The Hermit",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card9),"http://luciendo.cafe24.com/web/tarotcard/9_the_hermit.jpg","http://luciendo.cafe24.com/web/tarotcard/m_9_the_hermit.jpg"))
        list.add(Tarot(10,"Wheel of Fortune",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card10),"http://luciendo.cafe24.com/web/tarotcard/10_wheel_of_fortune.jpg","http://luciendo.cafe24.com/web/tarotcard/m_10_wheel_of_fortune.jpg"))
        list.add(Tarot(11,"Justice",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card11),"http://luciendo.cafe24.com/web/tarotcard/11_justice.jpg","http://luciendo.cafe24.com/web/tarotcard/m_11_justice.jpg"))
        list.add(Tarot(12,"The Hanged Man",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card12),"http://luciendo.cafe24.com/web/tarotcard/12_the_hanged_man.jpg","http://luciendo.cafe24.com/web/tarotcard/m_12_the_hanged_man.jpg"))
        list.add(Tarot(13,"Death",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card13),"http://luciendo.cafe24.com/web/tarotcard/13_death.jpg","http://luciendo.cafe24.com/web/tarotcard/m_13_death.jpg"))
        list.add(Tarot(14,"Temperance",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card14),"http://luciendo.cafe24.com/web/tarotcard/14_temperance.jpg","http://luciendo.cafe24.com/web/tarotcard/m_14_temperance.jpg"))
        list.add(Tarot(15,"The Devil",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card15),"http://luciendo.cafe24.com/web/tarotcard/15_the_devil.jpg","http://luciendo.cafe24.com/web/tarotcard/m_15_the_devil.jpg"))
        list.add(Tarot(16,"The Towel",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card16),"http://luciendo.cafe24.com/web/tarotcard/16_the_tower.jpg","http://luciendo.cafe24.com/web/tarotcard/m_16_the_tower.jpg"))
        list.add(Tarot(17,"The Star",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card17),"http://luciendo.cafe24.com/web/tarotcard/17_the_star.jpg","http://luciendo.cafe24.com/web/tarotcard/m_17_the_star.jpg"))
        list.add(Tarot(18,"The Moon",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card18),"http://luciendo.cafe24.com/web/tarotcard/18_the_moon.jpg","http://luciendo.cafe24.com/web/tarotcard/m_18_the_moon.jpg"))
        list.add(Tarot(19,"The Sun",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card19),"http://luciendo.cafe24.com/web/tarotcard/19_the_sun.jpg","http://luciendo.cafe24.com/web/tarotcard/m_19_the_sun.jpg"))
        list.add(Tarot(20,"The Judgement",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card20),"http://luciendo.cafe24.com/web/tarotcard/20_judgement.jpg","http://luciendo.cafe24.com/web/tarotcard/m_20_judgement.jpg"))
        list.add(Tarot(21,"The World",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card21),"http://luciendo.cafe24.com/web/tarotcard/21_the_world.jpg","http://luciendo.cafe24.com/web/tarotcard/m_21_the_world.jpg"))
        list.add(Tarot(22,"Ace of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card22),"",""))
        list.add(Tarot(23,"Two of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card23),"",""))
        list.add(Tarot(24,"Three of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card24),"",""))
        list.add(Tarot(25,"Four of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card25),"",""))
        list.add(Tarot(26,"Five of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card26),"",""))
        list.add(Tarot(27,"Six of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card27),"",""))
        list.add(Tarot(28,"Seven of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card28),"",""))
        list.add(Tarot(29,"Eight of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card29),"",""))
        list.add(Tarot(30,"Nine of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card30),"",""))
        list.add(Tarot(31,"Ten of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card31),"",""))
        list.add(Tarot(32,"Page of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card32),"",""))
        list.add(Tarot(33,"Knight of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card33),"",""))
        list.add(Tarot(34,"Queen of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card34),"",""))
        list.add(Tarot(35,"King of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card35),"",""))
        list.add(Tarot(36,"Ace of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card36),"",""))
        list.add(Tarot(37,"Two of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card37),"",""))
        list.add(Tarot(38,"Three of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card38),"",""))
        list.add(Tarot(39,"Four of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card39),"",""))
        list.add(Tarot(40,"Five of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card40),"",""))
        list.add(Tarot(41,"Six of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card41),"",""))
        list.add(Tarot(42,"Seven of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card42),"",""))
        list.add(Tarot(43,"Eight of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card43),"",""))
        list.add(Tarot(44,"Nine of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card44),"",""))
        list.add(Tarot(45,"Ten of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card45),"",""))
        list.add(Tarot(46,"Page of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card46),"",""))
        list.add(Tarot(47,"Knight of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card47),"",""))
        list.add(Tarot(48,"Queen of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card48),"",""))
        list.add(Tarot(49,"King of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card49),"",""))
        list.add(Tarot(50,"Ace of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card50),"",""))
        list.add(Tarot(51,"Two of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card51),"",""))
        list.add(Tarot(52,"Three of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card52),"",""))
        list.add(Tarot(53,"Four of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card53),"",""))
        list.add(Tarot(54,"Five of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card54),"",""))
        list.add(Tarot(55,"Six of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card55),"",""))
        list.add(Tarot(56,"Seven of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card56),"",""))
        list.add(Tarot(57,"Eight of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card57),"",""))
        list.add(Tarot(58,"Nine of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card58),"",""))
        list.add(Tarot(59,"Ten of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card59),"",""))
        list.add(Tarot(60,"Page of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card60),"",""))
        list.add(Tarot(61,"Knight of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card61),"",""))
        list.add(Tarot(62,"Queen of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card62),"",""))
        list.add(Tarot(63,"king of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card63),"",""))
        list.add(Tarot(64,"Ace of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card64),"",""))
        list.add(Tarot(65,"Two of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card65),"",""))
        list.add(Tarot(66,"Three of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card66),"",""))
        list.add(Tarot(67,"Four of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card67),"",""))
        list.add(Tarot(68,"Five of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card68),"",""))
        list.add(Tarot(69,"Six of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card69),"",""))
        list.add(Tarot(70,"Seven of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card70),"",""))
        list.add(Tarot(71,"Eight of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card71),"",""))
        list.add(Tarot(72,"Nine of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card72),"",""))
        list.add(Tarot(73,"Ten of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card73),"",""))
        list.add(Tarot(74,"Page of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card74),"",""))
        list.add(Tarot(75,"Knight of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card75),"",""))
        list.add(Tarot(76,"Queen of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card76),"",""))
        list.add(Tarot(77,"King of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card77),"",""))
        return list
    }
}