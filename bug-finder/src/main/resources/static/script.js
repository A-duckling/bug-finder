const app = document.getElementById("app");

fetch("/api/tree/start")
  .then(res => res.json())
  .then(renderNode);

function renderNode(node) {
  app.innerHTML = "";

  //if its a bug instead of the questions nodes, meaning its done
  if (node.bug) {
  app.innerHTML = `
    <h2>${node.bug.name}</h2>
    <p><strong>${node.bug.classification}</strong></p>
    <p>${node.bug.description}</p>
    <h3>Eats</h3>
    <ul>
      ${node.bug.eats.map(item => `<li>${item}</li>`).join("")}
    </ul>
    <h3>Affects Plants</h3>
    <ul>
      ${node.bug.affectsPlants.map(item => `<li>${item}</li>`).join("")}
    </ul>
    <button onclick="location.reload()">Restart</button>
  `;
if (node.bug.images) {
  const imageContainer = document.createElement("div");
  imageContainer.className = "image-container";

  node.bug.images.forEach(src => {
    const img = document.createElement("img");
    img.src = src;
    img.className = "bug-image";
    imageContainer.appendChild(img);
  });

  app.appendChild(imageContainer);
}


  return;

  }

//else, if it isnt a bug, then its questions: shows question
  const question = document.createElement("h2");
  question.textContent = node.question;
  app.appendChild(question);

  node.options.forEach(opt => {
    const btn = document.createElement("button");
    btn.textContent = opt.answer;
    btn.onclick = () => {
      fetch("/api/tree/next", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ next: opt.next })
      })
      .then(res => res.json())
      .then(renderNode);
    };
    app.appendChild(btn);
  });

  if (node.images) {
  const imageContainer = document.createElement("div");
  imageContainer.className = "image-container";

  node.images.forEach(src => {
    const img = document.createElement("img");
    img.src = src;
    img.className = "bug-image";
    imageContainer.appendChild(img);
  });

  app.appendChild(imageContainer);
}


}
