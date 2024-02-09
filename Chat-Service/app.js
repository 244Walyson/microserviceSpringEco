import { connectMongoDb } from "./src/modules/DbConfig/DbConfig.js";
import { createInitialData } from "./src/modules/DbConfig/InitialData.js";

connectMongoDb()
createInitialData()