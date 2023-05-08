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
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card0),""))
        list.add(Tarot(1,"The Magician",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card1),""))
        list.add(Tarot(2,"The High priestess",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card2),""))
        list.add(Tarot(3,"The Empress",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card3),""))
        list.add(Tarot(4,"The Emperor",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card4),""))
        list.add(Tarot(5,"The Hierophant",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card5),""))
        list.add(Tarot(6,"The Chariot",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card6),""))
        list.add(Tarot(7,"Strength",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card7),""))
        list.add(Tarot(9,"The Hermit",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card8),""))
        list.add(Tarot(9,"Wheel of Fortune",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card9),""))
        list.add(Tarot(10,"Justice",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card10),""))
        list.add(Tarot(11,"The Hanged Man",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card11),""))
        list.add(Tarot(12,"Death",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card12),""))
        list.add(Tarot(13,"Temperance",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card13),""))
        list.add(Tarot(14,"The Devil",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card14),""))
        list.add(Tarot(15,"The Towel",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card15),""))
        list.add(Tarot(16,"The Star",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card16),""))
        list.add(Tarot(17,"The Moon",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card17),""))
        list.add(Tarot(18,"The Sun",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card18),""))
        list.add(Tarot(19,"The Judgement",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card19),""))
        list.add(Tarot(20,"The World",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card20),""))
        list.add(Tarot(21,"The Fool",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card21),""))
        list.add(Tarot(22,"Ace of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card22),""))
        list.add(Tarot(23,"Two of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card23),""))
        list.add(Tarot(24,"Three of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card24),""))
        list.add(Tarot(25,"Four of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card25),""))
        list.add(Tarot(26,"Five of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card26),""))
        list.add(Tarot(27,"Six of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card27),""))
        list.add(Tarot(28,"Seven of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card28),""))
        list.add(Tarot(29,"Eight of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card29),""))
        list.add(Tarot(30,"Nine of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card30),""))
        list.add(Tarot(31,"Ten of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card31),""))
        list.add(Tarot(32,"Page of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card32),""))
        list.add(Tarot(33,"Knight of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card33),""))
        list.add(Tarot(34,"Queen of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card34),""))
        list.add(Tarot(35,"King of Swords",
            CardType.SWORD,AppCompatResources.getDrawable(context,R.drawable.card35),""))
        list.add(Tarot(36,"Ace of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card36),""))
        list.add(Tarot(37,"Two of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card37),""))
        list.add(Tarot(38,"Three of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card38),""))
        list.add(Tarot(39,"Four of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card39),""))
        list.add(Tarot(40,"Five of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card40),""))
        list.add(Tarot(41,"Six of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card41),""))
        list.add(Tarot(42,"Seven of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card42),""))
        list.add(Tarot(43,"Eight of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card43),""))
        list.add(Tarot(44,"Nine of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card44),""))
        list.add(Tarot(45,"Ten of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card45),""))
        list.add(Tarot(46,"Page of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card46),""))
        list.add(Tarot(47,"Knight of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card47),""))
        list.add(Tarot(48,"Queen of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card48),""))
        list.add(Tarot(49,"King of Wands",
            CardType.WAND,AppCompatResources.getDrawable(context,R.drawable.card49),""))
        list.add(Tarot(50,"Ace of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card50),""))
        list.add(Tarot(51,"Two of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card51),""))
        list.add(Tarot(52,"Three of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card52),""))
        list.add(Tarot(53,"Four of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card53),""))
        list.add(Tarot(54,"Five of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card54),""))
        list.add(Tarot(55,"Six of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card55),""))
        list.add(Tarot(56,"Seven of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card56),""))
        list.add(Tarot(57,"Eight of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card57),""))
        list.add(Tarot(58,"Nine of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card58),""))
        list.add(Tarot(59,"Ten of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card59),""))
        list.add(Tarot(60,"Page of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card60),""))
        list.add(Tarot(61,"Knight of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card61),""))
        list.add(Tarot(62,"Queen of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card62),""))
        list.add(Tarot(63,"king of Cups",
            CardType.CUP,AppCompatResources.getDrawable(context,R.drawable.card63),""))
        list.add(Tarot(64,"Ace of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card64),""))
        list.add(Tarot(65,"Two of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card65),""))
        list.add(Tarot(66,"Three of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card66),""))
        list.add(Tarot(67,"Four of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card67),""))
        list.add(Tarot(68,"Five of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card68),""))
        list.add(Tarot(69,"Six of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card69),""))
        list.add(Tarot(70,"Seven of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card70),""))
        list.add(Tarot(71,"Eight of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card71),""))
        list.add(Tarot(72,"Nine of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card72),""))
        list.add(Tarot(73,"Ten of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card73),""))
        list.add(Tarot(74,"Page of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card74),""))
        list.add(Tarot(75,"Knight of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card75),""))
        list.add(Tarot(76,"Queen of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card76),""))
        list.add(Tarot(77,"King of Pentacles",
            CardType.PENTACLE,AppCompatResources.getDrawable(context,R.drawable.card77),""))
        return list
    }
}