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
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card1),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F1_the_magician.jpg?alt=media&token=8baca864-c589-4f16-a003-b3cacddb54fb","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_1_the_magician.jpg?alt=media&token=e4285129-5980-445a-95bd-ededde3842c0"))
        list.add(Tarot(2,"The High priestess",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card2),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F2_the_high_priestess.jpg?alt=media&token=18fcd284-03cc-425d-ba8e-1229865bf9ea","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_2_the_high_priestess.jpg?alt=media&token=14233b47-9479-4e22-81bc-254b7181822b"))
        list.add(Tarot(3,"The Empress",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card3),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F3_the_empress.jpg?alt=media&token=413b1b9a-111a-4e42-8ace-fa3662e6a0ba","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_3_the_empress.jpg?alt=media&token=2703c5cc-2498-4c27-9445-26b87e5c5a17"))
        list.add(Tarot(4,"The Emperor",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card4),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F4_the_emperor.jpg?alt=media&token=28c56b62-c740-48ea-93cf-6112d7f9ee6e","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_4_the_emperor.jpg?alt=media&token=16828819-4d0b-477b-b876-77d9cf63c976"))
        list.add(Tarot(5,"The Hierophant",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card5),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F5_the_hierophant.jpg?alt=media&token=4cb23bca-07b6-406e-ae0e-8820830e5f3b","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_5_the_hierophant.jpg?alt=media&token=c6491ba9-83d5-4364-95c7-ab899bfe75d4"))
        list.add(Tarot(6,"The Lovers",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card6),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F6_the_lovers.jpg?alt=media&token=b434f057-41c0-4043-90cf-ef7352fcef8f","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_5_the_hierophant.jpg?alt=media&token=c6491ba9-83d5-4364-95c7-ab899bfe75d4"))
        list.add(Tarot(7,"The Chariot",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card7),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F7_the_chariot.jpg?alt=media&token=de5ae507-d6fb-4360-863f-bda601b45147","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_7_the_chariot.jpg?alt=media&token=e2bbdb57-622a-468a-872d-bed4f150c99e"))
        list.add(Tarot(9,"Strength",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card8),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F8_strength.jpg?alt=media&token=18623c60-4807-4fe1-8f86-040d31e32e2d","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_8_strength.jpg?alt=media&token=abe1da7c-ac15-44cd-b62c-c9300fa6054b"))
        list.add(Tarot(9,"The Hermit",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card9),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F9_the_hermit.jpg?alt=media&token=e133af54-b698-482e-857f-58e77c35a192","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_9_the_hermit.jpg?alt=media&token=450e747a-ac9b-4a40-b84a-e4fc75f233f8"))
        list.add(Tarot(10,"Wheel of Fortune",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card10),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F10_wheel_of_fortune.jpg?alt=media&token=d13b3186-7ab0-48b2-8746-4c561ce67704","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_10_wheel_of_fortune.jpg?alt=media&token=65af45fd-5031-4ff2-9fb5-264d202607d4"))
        list.add(Tarot(11,"Justice",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card11),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F11_justice.jpg?alt=media&token=0044231a-8f63-438e-b7f9-e64ef81ed070","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_11_justice.jpg?alt=media&token=45f5f5d6-0c75-410d-9061-68720cb1daeb"))
        list.add(Tarot(12,"The Hanged Man",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card12),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F12_the_hanged_man.jpg?alt=media&token=4105b5ee-dbf2-497d-96bd-8d12fec8e266","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_12_the_hanged_man.jpg?alt=media&token=a8586147-8778-4e09-9e56-2e86cceb5b3a"))
        list.add(Tarot(13,"Death",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card13),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F13_death.jpg?alt=media&token=b458c403-f47e-4be6-988c-0e90519c3ffa","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_13_death.jpg?alt=media&token=bc804b7b-90a8-427d-b0bf-4ec5ecd7bb3d"))
        list.add(Tarot(14,"Temperance",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card14),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F14_temperance.jpg?alt=media&token=b172d5a3-9f46-4c75-a493-9aa8ec3c6b30","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_14_temperance.jpg?alt=media&token=9f5e3fd8-21ba-4959-a856-1ae5977ca103"))
        list.add(Tarot(15,"The Devil",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card15),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F15_the_devil.jpg?alt=media&token=89c623df-df87-4d30-a89d-5ca861575b3b","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_15_the_devil.jpg?alt=media&token=8b2604e6-6f47-4bbc-a08b-ed3ad35ddcd3"))
        list.add(Tarot(16,"The Towel",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card16),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F16_the_tower.jpg?alt=media&token=9b8de286-d950-409d-b265-12d6f8639b96","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_16_the_tower.jpg?alt=media&token=21f90330-0cc7-4dca-a390-aa7b6c085616"))
        list.add(Tarot(17,"The Star",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card17),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F17_the_star.jpg?alt=media&token=4f76eb13-a544-46d1-8cfc-12140689ffae","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_17_the_star.jpg?alt=media&token=999a347c-c6ae-4058-ba64-3b68c8efefab"))
        list.add(Tarot(18,"The Moon",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card18),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F18_the_moon.jpg?alt=media&token=a564b186-b982-4bf4-b541-70446a43c374","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_18_the_moon.jpg?alt=media&token=c2d5f86e-4ffa-44d3-b6c7-823b95d4d3c7"))
        list.add(Tarot(19,"The Sun",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card19),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F19_the_sun.jpg?alt=media&token=1575016f-0f88-438a-9b50-68a420c4a5ea","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_19_the_sun.jpg?alt=media&token=3ce15186-7a94-4969-897e-3e0e34663625"))
        list.add(Tarot(20,"The Judgement",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card20),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F20_judgement.jpg?alt=media&token=7050883b-feb4-47b7-afb6-8772445725ee","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_20_judgement.jpg?alt=media&token=f3cc1c87-b614-4ac3-adf6-f988ab6b08dc"))
        list.add(Tarot(21,"The World",
            CardType.MAJOR,AppCompatResources.getDrawable(context,R.drawable.card21),"https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2F21_the_world.jpg?alt=media&token=29604f53-b9e2-44cd-b418-dced316ff713","https://firebasestorage.googleapis.com/v0/b/trarot-card.appspot.com/o/detailImg%2Fm_21_the_world.jpg?alt=media&token=1b3ea5d7-9c19-4009-abf6-306010ebbb04"))
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