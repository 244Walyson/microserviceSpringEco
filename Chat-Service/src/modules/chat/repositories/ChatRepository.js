import Chat from "../model/Chat.js";

class OrderRepository {
    async save(chat){
        try{
            return await Chat.create(chat);
        }catch(error){
            console.error(error.message);
            return null;
        }
    }
    async
}