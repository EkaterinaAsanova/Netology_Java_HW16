**Задание 1 (обязательное)**  
Ваша задача — разработать класс, управляющий турниром игроков. Каждый игрок описывается дата-классом *Player*  с полями **id, name, strength (сила)**.  

Сам же турнир описывается классом *Game* с методами:  

**register (Player player)** — метод регистрации игрока, если игрок не зарегистрирован, то он не сможет играть в турнире. Вам нужно хранить всех зарегистрированных игроков в поле класса Game в виде списка.  
**round (String playerName1, String playerName2)** — метод соревнования между двумя игроками. Если хотя бы один из игроков не зарегистрирован, должно выкинуться исключение *NotRegisteredException* — сами создайте его класс. Обратите внимание, что игроки передаются методу через имя — полную информацию об игроке нужно будет найти в коллекции зарегистрированных игроков (см. аналог в виде findById из прошлых домашних заданий). Выигрывает тот игрок, у которого больше strength (сила), если сила одинаковая, то будет ничья. Метод должен возвращать одно число — 0 в случае ничьи, 1 в случае победы первого игрока и 2 в случае победы второго игрока.
Напишите на класс Game тесты, покрыв по бранчам на 100%.



Итого: отправьте на проверку ссылку на репозиторий GitHub с вашим проектом.Задание 1 (обязательное)
