package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxAQEBAQEBAVEBAWDRIbDRUVDQ8QFQ4KIB0iIiAdHx8kKDQsJCYxJx8fLTItMSw3MDAvIytKQD8uPzQuQzUBCgoKDg0OFRAPFTcaFhktKzcrKy03Kzc3NystKzc3MCs3NysuKy03ODcrKyszNys3Ky0rNysuKysrNysrKysrLf/AABEIAJYAlgMBIgACEQEDEQH/xAAbAAACAgMBAAAAAAAAAAAAAAAEBQMGAAECB//EAEAQAAEDAwIEAwUFBQUJAAAAAAEAAhEDBCEFMQYSQVEiYXETMoGhwUJykbHwJDNSgtEUI2Ph8RVDU2JzkqKywv/EABoBAAMBAQEBAAAAAAAAAAAAAAIDBAEABQb/xAApEQACAgEDAgUEAwAAAAAAAAAAAQIRAxIhMQRBExQyUWEiM3GBI0JS/9oADAMBAAIRAxEAPwDySmERVOFFSapaoRCWtwdZK6IXIC400FMxchqkYMSdunquOqyO6dAAHX3vu9lxSLSeg9ZwmlLRrity+E+IY391MaHCLw4N3PXaEyHTTlvRzz44bWV19FxB8PSQRGT5qL3W75P/AKq1XHDLmzkiD06pZW0R7nQBgeUJnlpxB8zCXcSPfIGB54AyoOs4/DCZXFiWkgDb80LUtiN8JEsUlyNWRMHeQTJC0JGx/wBFt9MjouEHARM3xY6rpjyw9x27KFhkx1UxHXr9odwsNGNFwOyPptwkNrV5TO4nKsAd4UyDJM0aYHVOVi5qjK2tZy4LM3hB7WAneEpvNIcwxuvSeLdQFMlrdhsqLU1AudJ2lWRxQa4AeSdlbubdzdwomhXfU7RlShzAZj5pdpNnUqW5LQ2o0PLSx7Q4SO3UfBTZMai9iiFz/JWZkqzcIcOOuantHfuabgD2dW7ITUtF5WivTBDOaKjDk06vaeo7L17Q9NbZ6fTYB4uUOf51iAT8ytxQuSsHI9EX7g9xbMFamwACG/NT0bJvtST0Qt00vc2o2cRKb0ocwO6ZnaYhek20jzIpSkJtTtqfMWxnqJG52SN9uGtLoEnDU61O6aavKJwPF3QV1WaOeRAHuyAMd89f6LLCK7cWVOm2TuRnyVYurcFxPc4HYKwaiXVHYkCevZLapaye/wBUEkmNg2hO7TjmT6JTdUeUkJ9cV5wEDWty7KkyQT4K8c33FDZBBCnbE56rmszlK0DIHqpGqKEc80HyT2xq81ON4/JIKqY6NVMuH2YyegK1cgZFcQt5ysXNV7Z94H0DisW2LUJVwXC5Fa45nmYVbu3FphekXdalTpECNvJeeXxa5xI6lW6npoSktQzsLzmpFh7JtwRUbTNei4yHAOA8xg/RU+pcezbhD2OqVKdVlVpy10+o7JM5dmPx7O0eqGybVJpwCHPpHvLQ4fQlWG9vJqOpnDdvollChyl72EsDWeAk4g7FV28DqbiW3PMe3/MqenikrYjq25OkXGnYuYecGQekiCP6opoBBc3AO+45XKtaHrNZwLHkEhuOz2d/UJ8JHMBkFsjoE1tvkmikhVRtQXz1kkrnU6LScmTyxA32U9vUDQ553AgDB8RQt9qNOlAIl7hLid/Vd3OdCG/snOnHIOmZ8KrtxaAbulM9Z4qDnQBsckCJSavr/NtTjMuPUlC5x7hxjL2IqjOXYfJDvYTvhSu1EPwRyoilYFzS6ZET8EmVPgfFPuVu/pwcKBpHKR1TDV2AGAMoCmJkeajyLcqhwZTa3E5+pU9IF5A6dABhRURITCzYB5pbHQW4bbafhYtV7osgN36z2W1mgZLqIp0ONduiGwJ889FXOcymfEIc16WsEglW9zzY7oCu6smF1QCHq+8UXQ2U7dsfwi/3V9XuLSzp0XObUq+yY7AAJk0xnzIlKtS03+y21apVuQ6o2u1tCmaA/vm9XTGMeasnClCqdMbWaRzMu3miDIHs2gY/ElGjWbF1Plu6JdnLSxrxzd0OV5lUoK0Mh4bTUuSs8M1qhNNrgRzM5qRP2qa9MtKfNTcS7xcvbd3mqte6rSuqts21oxTYanM48oLTy4AHb+itrGxTcQDhv4N/1V3T5JzxJzVM8/PCMctR4EdyGhhJcAQ4mCPe7D5Kk8RXsFxDveH8QMM3hWLWbqJbMHptyzI37Befa7cyTB9dh4kc5UgYQtgDriXQPrupqdy4AmCR1/u3AIzhG3LqhdTfyVWkchxIHcK0cMcJmh7SrXfLSZOA0Rn5rysnV6G/c9OPTakikGq1/kfqrfwdS9rSq0yMhuPRVziCgwVi+kOUFxwO3on3Atch7hmYx5iVTjyOStipwUXRU+IG8tZ7NyHEJY0QPVOOKGxdVwf+I6fVJnCAJ+HogychR4CLZmAiXXApsMHxHZAurcrYG5G/YKBsz8UAVjV7iYnJ5QT5mFi0/wCgWLRL5H/ELw5xhLqNOQUdcmSSRlA0wZxsra3ERVIUXVOHFTUTAlH17YH1Q1S2gHtGfRIyY3FaijG9bUUeucA1m/7NoU8Rz1Z+8TP1CYXei0CS40w4yYJEz8FRuCL/APZA2fEyrI290gD/AOSrzaam14yYMZ9VVgWrGmK6n6crQEy1ZSc2ABg8uAIbsnNarFu49z8u6SOfz1T2aPn+gi9Yq/s4AMSfkntbEStyKLrl4XEnmwPM4/UBVevT5zA/RTvVwZIE+eTskltU8ZHYqXJzTKoKlaGFhZu5QQ4tI2g/RS3NC4Mt53OAn7ZALUVYvAMz+Smur1gBE/Ceq7w4tBKcrEpsuT3iJ/FWjgO05qrndA0qpXV4XmAOqv3DpFrp9a4MB3snH4xhLlS2Q2CfLPM+IKofc13DY13BvpKWVsmO2FPVqnBPXmd8f0EOwS4KaW7Grg3XGfgFlNskDrPzWqxyV3RHibichCcMXNyVtENonKxEKsul7pTQ2YykZtYMBXHUCOUqte2aXEL1FSZFG3EgbYSlmu0xTpkdSP19VaqHL1VW4yfLw0ZHIJ8iSk9X6KKejdZLfswDhXUHU6zWdHAj+bcfP81frapPiGO4XnXDJDbugXCQKzJHfK9KtqADxBlpf/4pXSZVbgb1cHSn+iev7RrfaM97t0c1I9Y4ofAY7wlo25VaL+6psAEyTsBHuqqa37Co4FzfEBtg4T8sv8uhGBP+0bRVrjUn1CdzPkFxb04PMd5zujbikwHAj1USn3u2x7fwdvrkbE/5oSo+dyuqjkJUcVsps6MQyxhzx2G6ecQa3+yC2bu4jmA/h7Kt0avIMb/RD1rg83NORt95LvYaiC5PiIGwwPQKKj7ywhdWu/62SQzl5yfVTW48bfUfioP6omz/AHjeniCw4vtvpHOAW9srExsS9kYwWCPRYssSyDVb8ukNVVbcHn+KO1O/FOoWjaUNQpe0fzBeg5J8cjPDjjRNV1AtG6VXry5xcdi75tH+aJ1Wj42t8x+CXag/A+7+eUnqJttJg4IrlHGhQbmh/wBdk+kq58L6j7RlVpMllZ//AGEkj6/gqRoh/aKJ/wAZn5qbh7Uv7PcBzvccYq/dnf4JGGWnLfwNzLVir5Z6Nc6HbPHM6tUa9wHMRU91yRXPDGT7O5J+8JMJxqeluqtBY8g7ggnZJrvRLmkJFcmRtg4VmTFbuibHlpU2Jr6wq05HtWv/AJSgW+0G5CIvKdYHxmfh0Q4JU9UNbTOnPwoSVjyoKlVc2CkbqPj1QzjMeq2TK5G4QNho3UwD+sLu32Poo6/QIuwA6xEZnaED2DStgjRsi9P/AHgPbMeSEHRHaUJfjeFxx6xo7w/cbMH4LEt0uq8lxaMQBPcraETZSdRy8mZyj9Luw0ZSms8lapuKsi6Z0naob13itWaMxPigAkN6/KVXdVuC+q4xGTiAITS2cGio44IYeUmcu2j5z8EhqmSSUjK9UxuNaYII093LVon/ABWn5oJxyfVFNEFnpIW79kBg2PIJwB0S+4fMS7cIcRt9iKVQ+Nghs55qXT8NkyvNcY4Zz3g9F5pp7SarAP4h32VofpIcJa9zT1BghehiySlDZcEOSMYy3B7+5a5xKW1awRdbSnDd8/yoapZR5pMtXsMi4gVSoTsooRLqa5LUoZZAWrTDn4LuouKW5QyCRHUMuTCygA4+zjMZS4CT8UZWgNg5PSOhQtWHF07BmdE14fZNUSMSAfSUrZ0TfQgecQP9438Fxh7Xwhp1N1KcLEq0y8dQZAWJ/lZk/jRPLXsC4GFIXKJ5T2AjdwYpTOSduzep/JKSMmM9Pim94YpMEZPz6n5QlBIEHYyT8FHLllS4RJXfGegYQPSSFxd1A7ljHhEgEmCua2zB5Z/FRAblDXc29qGGiOaKzXHoZ/l6r0BjGuA5TIIVH4Voh1fIkchlWrWWV21qdWnTa1opgO5Jip5kdMKzDOUEvpuLI88YzlV00FXFngmPVIb+nkiFZaF6K9OaYBPL4pcGBvqSqnqNdwcQ4RncEESsyZserSnuDjxzq2hfVp5UZpYUtSsF2KLnN5pAHmeiTKUY8soSb4F1ULhsTnt811U3PkUbo2mG5qOYH06fLSJJqOLQR5QDnKXOSqxsItulyLKLfF8VJW38oXT6PJULJDoJEjYlcVTkrFua1WzOafT1TbTHltRpG4eT+SU0tvimNo4ipgTjP3Vvc49L9vIELEm069kGdwVi9eMtjy5J2VMlYQtLFFLgrRmqiHcvQM8Pr+glT9/QR8FixSIpZy90gHyP5rjoFtYtMLTwHQDqlQntCvNRuI6D5BYsXp4PtI8zN91iW9aKZcGiOYAmMS7uqzqrpBnutLF8/kS81L8np4n/ABoHoURAJzjHouK7O2FixeppWkS27An4R/DLj/aWgEDma4SaYfAjtIW1imzellWD1xBb7Fd4mTzbxCErblaWLIcI7L6maZsUwsf3jfMZ9FixEAhva1yHP+8VixYrYt0RzS1M/9k="),
            new User("002", "Paul", "https://api.adorable.io/AVATARS/512/2.png"),
            new User("003", "Phil", "https://api.adorable.io/AVATARS/512/3.png"),
            new User("004", "Guillaume", "https://api.adorable.io/AVATARS/512/4.png"),
            new User("005", "Francis", "https://api.adorable.io/AVATARS/512/5.png"),
            new User("006", "George", "https://api.adorable.io/AVATARS/512/6.png"),
            new User("007", "Louis", "https://api.adorable.io/AVATARS/512/7.png"),
            new User("008", "Mateo", "https://api.adorable.io/AVATARS/512/8.png"),
            new User("009", "April", "https://api.adorable.io/AVATARS/512/9.png"),
            new User("010", "Louise", "https://api.adorable.io/AVATARS/512/10.png"),
            new User("011", "Elodie", "https://api.adorable.io/AVATARS/512/11.png"),
            new User("012", "Helene", "https://api.adorable.io/AVATARS/512/12.png"),
            new User("013", "Fanny", "https://api.adorable.io/AVATARS/512/13.png"),
            new User("014", "Laura", "https://api.adorable.io/AVATARS/512/14.png"),
            new User("015", "Gertrude", "https://api.adorable.io/AVATARS/512/15.png"),
            new User("016", "Chloé", "https://api.adorable.io/AVATARS/512/16.png"),
            new User("017", "April", "https://api.adorable.io/AVATARS/512/17.png"),
            new User("018", "Marie", "https://api.adorable.io/AVATARS/512/18.png"),
            new User("019", "Henri", "https://api.adorable.io/AVATARS/512/19.png"),
            new User("020", "Rémi", "https://api.adorable.io/AVATARS/512/20.png")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://api.adorable.io/AVATARS/512/21.png"),
            new User("022", "Geoffrey", "https://api.adorable.io/AVATARS/512/22.png"),
            new User("023", "Simon", "https://api.adorable.io/AVATARS/512/23.png"),
            new User("024", "André", "https://api.adorable.io/AVATARS/512/24.png"),
            new User("025", "Leopold", "https://api.adorable.io/AVATARS/512/25.png")
    );
}
