// let jasonRsop = 
// '{"fact": "Cats lose almost as much fluid in the saliva while grooming themselves as they do through urination.","length": 100}';
// console.log(jasonRsop);

// let validRes = JSON.parse(jasonRsop);
// console.log(validRes);
// console.log(validRes.fact )


// // <+++++++++++++++++++++++++++++++++++++++ fetch with then and catch  +++++++++++++++++++++++>
// let url = "https://catfact.ninja/fact";
// fetch(url)
//     .then((response) => {
//         console.log(response);
//         return response.json()
//     })
//     .then((data) => {
//         console.log("Data 1 : ",data.fact);
//         return fetch(url);
//     })
//     .then((response) => {
//         return response.json();
//     })
//     .then((data) => {
//         console.log("data 2 : ",data.fact);
//     })
//     .catch((err) => {
//         console.log("error", err);
//     })
// console.log(" i am happy")

// /// <+++++++++++++++++++++++++++++++++++ fetch with async await ++++++++++++++++++++++++++++>

let url = "https://catfact.ninja/fact";

async function getFacts() {
    try {
        let res = await fetch(url);
        let data = await res.json();
        console.log(data.fact);

        let res2 = await fetch(url);
        let data2 = await res2.json();
        console.log(data2.fact);
    } catch (err) {
        console.log('ERRor', e);
    }
    console.log("bye")
}