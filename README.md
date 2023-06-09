<!-- PROJECT LOGO -->
<br />
<div align="center">
<h1 align="center">Eris</h1>
<a name="readme-top"></a>
  <p align="center">
    A fast and secure OpenAI Api integration plugin for your IntelliJ IDEA
    <br />
    <a href="https://github.com/autentia/eris"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/autentia/eris/issues">Report Bug</a>
    ·
    <a href="https://github.com/autentia/eris/issues">Request Feature</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">OpenAI Key generation</a></li>
        <li><a href="#installation">Plugin generation</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

Eris is an IntelliJ IDEA plugin that helps you to interact with OpenAI Codex,
[OpenAI's system](https://openai.com/blog/openai-codex) that translate from natural language into code.
For that, the plugin uses the provided API by OpenAI.

With this plugin we want to share a reliable solution to interact with an AI API, without inspecting your project or
sending more data than needed: you can add some context to the prompt, but nothing more.

Having a plugin integrated into your IDE with the ability to add pieces of code into your context is a fast way to interact with an AI without losing your context.



<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- GETTING STARTED -->
## Getting Started

Eris is not yet published into JetBrains Marketplace plugin repository, but following a couple of steps you can install and use the plugin. 

### Prerequisites


* Eris plugin works on JetBrains IntelliJ IDEA Community and Ultimate editions.
* OpenAI Codex [API Key](https://openai.com/blog/openai-codex) (OpenAI API usage is NOT FREE).
### OpenAI Key generation
First of all, we need an OpenAI API Key:
1. Create an account in [Codex](https://openai.com/blog/openai-codex).
2. Once logged in go to Personal -> Manage account.
3. Under User/API Keys you can generate a new Key that will be used in our plugin configuration.

### Plugin generation


1. Clone the repo:
   ```sh
   git clone https://github.com/autentia/eris
   ```
2. Go to project folder, and build Eris plugin:
   ```sh
   ./gradlew buildPlugin 
   ```
   A .zip file is created on projectFolder/build/distributions
### Installation




1. Press <kbd data-test="keystroke" class="keystroke">⌘ Comma</kbd> to open the IDE settings and select Plugins.
2. On the Plugins page, click ![settings](https://resources.jetbrains.com/help/img/idea/2023.1/app.general.gearPlain_dark.svg) button and then click Install Plugin from Disk… .
3. Select the previous .zip file and click OK.
4. Click OK to apply the changes and restart the IDE if prompted.


<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- USAGE EXAMPLES -->
## Usage

We can see that a new Eris section was added on the right panel.

1. First section is the Context box. Here you can add a context for your requests. You can write something or add code from your editor:
   * Select text on your code. 
   * Press right click button and a new action Add to Eris is shown.
   * Click and the selected code will be added into your Context section.
2. The middle section is your prompt, where you can write questions or ask something regarding your Context content.
3. Last section is the Answer box. The AI answer is shown here.

To interact with the OpenAi API, we need to add our OpenAI Key into our Eris settings:
1. Press <kbd data-test="keystroke" class="keystroke">⌘ Comma</kbd> to open the IDE settings.
2. Go to Tools -> Eri Settings to add the key.


<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ROADMAP -->
## Roadmap

- [ ] Hide OpenAi key on settings.
- [ ] Set the focus into prompt text field when the plugin in opened.
- [ ] Create SDK UI tests.
- [ ] Extend plugin usage to other JetBrains IDE's
    - [ ] WebStorm
    - [ ] PyCharm
    - [ ] CLion
    - [ ] Rider
    - [ ] DataGrip

See the [open issues](https://github.com/autentia/eris/issues) for a full list of proposed features (and known issues).

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/feature`)
3. Commit your Changes (`git commit -m 'Add some feature'`)
4. Push to the Branch (`git push origin feature/feature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under GPL 3 License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Óscar Sánchez - [@oskeeker](https://twitter.com/oskeeker) - oscar.sanchez@autentia.com

Project Link: [https://github.com/autentia/eris](https://github.com/autentia/eris)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments


* [OpenAI-Java library](https://github.com/TheoKanning/openai-java)

<p align="right">(<a href="#readme-top">back to top</a>)</p>