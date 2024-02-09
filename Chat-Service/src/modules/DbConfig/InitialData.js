import ChatRoom from "../chat/model/Chat.js";

export async function createInitialData(){
    await ChatRoom.collection.drop();
    await ChatRoom.create({
       name: "new chat",
       participants: [{
        id: "1",
        name: "teste",
        email: "teste@gmail.com"
       },
       {
        id: "2",
        name: "teste2",
        email: "teste2@gmail.com"
       }
    ],
    messages: [
        {
            user: {
            id: "1",
            name: "teste",
            email: "teste@gmail.com"
        },
        text: "new message to u",
        sendAt: Date.now()
        },
        {
            user: {
            id: "2",
            name: "teste2",
            email: "teste2@gmail.com"
        },
        text: "new message to u2",
        sendAt: Date.now()
        }
    ]
        
    })

    
}